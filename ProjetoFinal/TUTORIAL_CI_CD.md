# 🚀 Tutorial de CI/CD com GitHub Actions e Azure

Este tutorial mostra como configurar um pipeline de CI/CD (Continuous Integration/Continuous Deployment) usando GitHub Actions para fazer deploy automático da aplicação Spring Boot no Azure App Service.

## 📋 Pré-requisitos

- ✅ Conta no GitHub
- ✅ Conta no Azure (com App Service criado)
- ✅ Repositório GitHub com o código do projeto
- ✅ Azure CLI instalado (opcional, para facilitar configuração)

---

## 🎯 O que é CI/CD?

- **CI (Continuous Integration)**: Integração contínua - executa testes e builds automaticamente quando código é enviado ao repositório
- **CD (Continuous Deployment)**: Deploy contínuo - faz deploy automático da aplicação quando o build é bem-sucedido

**Benefícios:**
- ✅ Deploy automático após cada push
- ✅ Menos erros manuais
- ✅ Histórico de deploys
- ✅ Rollback fácil
- ✅ Testes automáticos antes do deploy

---

## 📝 Passo 1: Obter Credenciais do Azure

### 1.1 Criar Service Principal no Azure

O Service Principal é uma identidade que permite ao GitHub Actions fazer deploy no Azure.

**Opção A - Via Azure Portal:**

1. Acesse o [Azure Portal](https://portal.azure.com)
2. Vá em **Azure Active Directory** → **App registrations** → **New registration**
3. Preencha:
   - **Name**: `github-actions-produtos-api`
   - **Supported account types**: Accounts in this organizational directory only
   - Clique em **Register**
4. Anote o **Application (client) ID** e **Directory (tenant) ID**
5. Vá em **Certificates & secrets** → **New client secret**
6. Crie um secret e **COPIE O VALOR** (você só verá uma vez!)
7. Anote o **Secret Value**

**Opção B - Via Azure CLI (Mais Rápido):**

```bash
# Login no Azure
az login

# Criar Service Principal
az ad sp create-for-rbac --name "github-actions-produtos-api" \
  --role contributor \
  --scopes /subscriptions/{SUBSCRIPTION_ID}/resourceGroups/{RESOURCE_GROUP} \
  --sdk-auth
```

**Saída esperada:**
```json
{
  "clientId": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
  "clientSecret": "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx",
  "subscriptionId": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
  "tenantId": "xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx",
  "activeDirectoryEndpointUrl": "https://login.microsoftonline.com",
  "resourceManagerEndpointUrl": "https://management.azure.com/",
  "activeDirectoryGraphResourceId": "https://graph.windows.net/",
  "sqlManagementEndpointUrl": "https://management.core.windows.net:8443/",
  "galleryEndpointUrl": "https://gallery.azure.com/",
  "managementEndpointUrl": "https://management.core.windows.net/"
}
```

### 1.2 Obter Informações do App Service

Você precisará de:
- **Nome do App Service**: Ex: `bootcamp-produtos-italobraz-avguhkbtcebtceap`
- **Resource Group**: Ex: `bootcamp-produtos-rg`
- **Subscription ID**: Encontre no Azure Portal → Subscriptions

---

## 🔐 Passo 2: Configurar Secrets no GitHub

1. Acesse seu repositório no GitHub
2. Vá em **Settings** → **Secrets and variables** → **Actions**
3. Clique em **New repository secret**
4. Adicione os seguintes secrets:

| Secret Name | Valor | Descrição |
|------------|-------|-----------|
| `AZURE_CLIENT_ID` | `clientId` do passo anterior | Client ID do Service Principal |
| `AZURE_CLIENT_SECRET` | `clientSecret` do passo anterior | Secret do Service Principal |
| `AZURE_SUBSCRIPTION_ID` | `subscriptionId` do passo anterior | ID da Subscription do Azure |
| `AZURE_TENANT_ID` | `tenantId` do passo anterior | Tenant ID do Azure |
| `AZURE_WEBAPP_NAME` | Nome do seu App Service | Ex: `bootcamp-produtos-italobraz-avguhkbtcebtceap` |
| `AZURE_RESOURCE_GROUP` | Nome do Resource Group | Ex: `bootcamp-produtos-rg` |

> ⚠️ **Importante**: Mantenha esses secrets seguros! Nunca os compartilhe publicamente.

---

## 📁 Passo 3: Criar o Workflow do GitHub Actions

1. No seu repositório GitHub, crie a pasta `.github/workflows` (se não existir)
2. Crie o arquivo `.github/workflows/deploy-azure.yml`

### Estrutura de Pastas:
```
produtos-api/
├── .github/
│   └── workflows/
│       └── deploy-azure.yml
├── src/
├── pom.xml
└── ...
```

### Conteúdo do arquivo `deploy-azure.yml`:

```yaml
name: Deploy Spring Boot to Azure

on:
  push:
    branches:
      - main        # Altere para 'master' se sua branch principal for 'master'
  workflow_dispatch:  # Permite execução manual

env:
  JAVA_VERSION: '17'
  AZURE_WEBAPP_NAME: ${{ secrets.AZURE_WEBAPP_NAME }}
  AZURE_RESOURCE_GROUP: ${{ secrets.AZURE_RESOURCE_GROUP }}

jobs:
  build-and-deploy:
    runs-on: ubuntu-latest
    
    steps:
    - name: Checkout código
      uses: actions/checkout@v4

    - name: Configurar Java JDK ${{ env.JAVA_VERSION }}
      uses: actions/setup-java@v4
      with:
        java-version: ${{ env.JAVA_VERSION }}
        distribution: 'temurin'
        cache: 'maven'

    - name: Build com Maven
      run: |
        mvn clean package -DskipTests

    - name: Login no Azure
      uses: azure/login@v2
      with:
        client-id: ${{ secrets.AZURE_CLIENT_ID }}
        tenant-id: ${{ secrets.AZURE_TENANT_ID }}
        subscription-id: ${{ secrets.AZURE_SUBSCRIPTION_ID }}

    - name: Deploy para Azure App Service
      uses: azure/webapps-deploy@v3
      with:
        app-name: ${{ env.AZURE_WEBAPP_NAME }}
        resource-group: ${{ env.AZURE_RESOURCE_GROUP }}
        package: './target/*.jar'
        startup-command: 'java -jar /home/site/wwwroot/app.jar'

    - name: Logout do Azure
      run: |
        az logout
```

---

## 🎨 Passo 4: Personalizar o Workflow (Opcional)

### 4.1 Executar apenas em uma pasta específica

Se você quiser que o deploy só aconteça quando houver mudanças na pasta `produtos-api`:

```yaml
on:
  push:
    branches:
      - main
    paths:
      - 'produtos-api/**'  # Apenas mudanças nesta pasta
```

### 4.2 Executar testes antes do deploy

```yaml
    - name: Executar testes
      run: |
        mvn test

    - name: Build com Maven
      run: |
        mvn clean package
```

### 4.3 Notificações (Slack, Email, etc.)

```yaml
    - name: Notificar sucesso
      if: success()
      run: |
        echo "Deploy realizado com sucesso!"

    - name: Notificar falha
      if: failure()
      run: |
        echo "Deploy falhou!"
```

### 4.4 Deploy apenas em tags

```yaml
on:
  push:
    tags:
      - 'v*'  # Ex: v1.0.0, v1.1.0
```

---

## 🚀 Passo 5: Testar o Pipeline

### 5.1 Primeiro Deploy

1. Faça commit e push do arquivo `.github/workflows/deploy-azure.yml`:

```bash
git add .github/workflows/deploy-azure.yml
git commit -m "Adiciona CI/CD com GitHub Actions"
git push origin main
```

2. Acesse **Actions** no seu repositório GitHub
3. Você verá o workflow em execução
4. Clique no workflow para ver os logs em tempo real

### 5.2 Verificar Deploy

- ✅ Workflow deve completar com sucesso (verde)
- ✅ App Service no Azure deve estar atualizado
- ✅ Aplicação deve estar rodando

---

## 🔍 Troubleshooting

### Erro: "Authentication failed"

**Solução:**
- Verifique se os secrets estão configurados corretamente
- Confirme que o Service Principal tem permissões de Contributor no Resource Group

### Erro: "No such file or directory: target/*.jar"

**Solução:**
- Verifique se o build do Maven está gerando o JAR
- Confirme o caminho do JAR no `pom.xml`
- Adicione logs para debug:

```yaml
    - name: Listar arquivos gerados
      run: |
        ls -la target/
```

### Erro: "App Service not found"

**Solução:**
- Verifique o nome do App Service no secret `AZURE_WEBAPP_NAME`
- Confirme que o Resource Group está correto

### Erro: "Java version mismatch"

**Solução:**
- Verifique a versão do Java no `pom.xml` (deve ser 17)
- Confirme que o Azure App Service está configurado para Java 17

### Workflow não executa

**Solução:**
- Verifique se o arquivo está em `.github/workflows/`
- Confirme que a branch está correta (`main` ou `master`)
- Verifique a sintaxe YAML (use um validador online)

---

## 📊 Monitoramento

### Ver histórico de deploys

1. GitHub → **Actions** → Veja todos os workflows executados
2. Azure Portal → **App Service** → **Deployment Center** → Veja histórico de deploys

### Logs do Workflow

- GitHub → **Actions** → Clique no workflow → Veja logs detalhados de cada step

### Logs da Aplicação

- Azure Portal → **App Service** → **Log stream** → Veja logs em tempo real

---

## 🎯 Melhores Práticas

### 1. Usar Environments

Crie ambientes separados para desenvolvimento e produção:

```yaml
jobs:
  deploy:
    environment: production  # Cria ambiente no GitHub
    steps:
      # ...
```

### 2. Aprovação Manual para Produção

Configure aprovação manual antes do deploy em produção:

1. GitHub → **Settings** → **Environments**
2. Crie ambiente `production`
3. Adicione **Required reviewers**

### 3. Branch Protection

Proteja a branch `main`:
- GitHub → **Settings** → **Branches** → **Add rule**
- Exija pull requests e revisões antes de merge

### 4. Secrets Rotativos

- Rotacione os secrets do Azure periodicamente
- Use Azure Key Vault para gerenciar secrets

### 5. Notificações

Configure notificações para:
- ✅ Deploy bem-sucedido
- ❌ Deploy falhou
- ⚠️ Workflow cancelado

---

## 📚 Recursos Adicionais

- [GitHub Actions Documentation](https://docs.github.com/en/actions)
- [Azure Actions](https://github.com/azure/actions)
- [Spring Boot Deployment](https://spring.io/guides/gs/spring-boot-for-azure/)
- [Maven Wrapper](https://maven.apache.org/wrapper/)

---

## ✅ Checklist Final

- [ ] Service Principal criado no Azure
- [ ] Secrets configurados no GitHub
- [ ] Arquivo `.github/workflows/deploy-azure.yml` criado
- [ ] Primeiro deploy testado com sucesso
- [ ] Workflow executando automaticamente após push
- [ ] Aplicação funcionando no Azure após deploy

---

## 🎉 Pronto!

Agora seu projeto tem CI/CD configurado! Toda vez que você fizer push na branch `main`, o GitHub Actions irá:

1. ✅ Fazer checkout do código
2. ✅ Configurar Java 17
3. ✅ Executar build com Maven
4. ✅ Fazer deploy automático no Azure
5. ✅ Aplicação atualizada e rodando!

**Tempo médio de deploy:** 3-5 minutos

---

**Desenvolvido por Ítalo Braz** 🚀

