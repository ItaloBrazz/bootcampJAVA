<div align="center">

# 🛍️ Sistema de Gerenciamento de Produtos

### API REST + Frontend Web Completo

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="80"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" alt="Spring Logo" width="80"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" alt="HTML5 Logo" width="60"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" alt="CSS3 Logo" width="60"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" alt="JavaScript Logo" width="60"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![REST API](https://img.shields.io/badge/API-REST-green?style=for-the-badge)](https://github.com)
[![JPA](https://img.shields.io/badge/JPA-Hibernate-blue?style=for-the-badge)](https://hibernate.org/)
[![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
[![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/pt-BR/docs/Web/CSS)
[![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript)

</div>

---

## 📋 Sobre o Projeto

Sistema completo de gerenciamento de produtos composto por:

- **Backend:** API REST desenvolvida com **Spring Boot** para gerenciamento de produtos
- **Frontend:** Interface web moderna e responsiva para interação com a API
- **Persistência:** Banco de dados H2 com **JPA/Hibernate** para armazenamento de dados
- **Arquitetura:** Controller + DTOs + Service Layer + Repository (**SOLID completo**)

Uma aplicação full-stack que demonstra os conceitos fundamentais de desenvolvimento de APIs REST, **persistência de dados com JPA/Hibernate**, e desenvolvimento front-end moderno.

> 🎯 **Ideal para:** Estudantes aprendendo Spring Boot, APIs REST, JPA/Hibernate, persistência de dados, desenvolvimento front-end e integração entre frontend e backend

---

## ✨ Funcionalidades

### 🔌 Backend - API REST

| Método HTTP | Endpoint | Descrição | Status Code |
|------------|----------|-----------|-------------|
| **GET** | `/produtos` | Lista todos os produtos | 200 OK |
| **GET** | `/produtos/{id}` | Busca produto por ID | 200 OK / 404 Not Found |
| **GET** | `/produtos/busca?nome=...` | Busca produto por nome (contém, case-insensitive) | 200 OK |
| **POST** | `/produtos` | Cria novo produto | 201 Created |
| **PUT** | `/produtos/{id}` | Atualiza produto existente | 200 OK / 404 Not Found |
| **DELETE** | `/produtos/{id}` | Remove produto | 204 No Content / 404 Not Found |
| **GET** | `/produtos/hello` | Endpoint de teste | 200 OK |

### 🌐 Frontend - Interface Web

- ✅ **Listar Produtos** - Visualize todos os produtos cadastrados em tempo real
- ✅ **Cadastrar Produto** - Formulário intuitivo para adicionar novos produtos
- ✅ **Editar Produto** - Atualize informações de produtos existentes
- ✅ **Excluir Produto** - Remova produtos com confirmação
- ✅ **Interface Responsiva** - Funciona perfeitamente em desktop e mobile
- ✅ **Feedback Visual** - Alertas de sucesso/erro em todas as operações
- ✅ **Formatação de Preços** - Valores formatados em Real (R$)
- ✅ **Validação de Formulários** - Validação client-side antes de enviar

### 📊 Dados Gerenciados

**Informações do Produto:**
```java
✓ ID (gerado automaticamente)
✓ Nome
✓ Preço
✓ Quantidade
```

**Contrato da API (DTOs):**
- **Entrada (Request)**: `nome`, `preco`, `quantidade` (a API **não** expõe/recebe a entidade diretamente)
- **Saída (Response)**: `id`, `nome`, `preco`, `quantidade`

---

## 🚀 Deploy na Azure

A aplicação está deployada e acessível publicamente em:

**URL da API:** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/produtos

**Swagger UI:** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/swagger-ui.html

**API Docs (JSON):** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/api-docs

### Endpoints Disponíveis

- **GET** `/produtos` - Listar todos os produtos
- **GET** `/produtos/{id}` - Buscar produto por ID
- **GET** `/produtos/busca?nome=...` - Buscar produto por nome
- **POST** `/produtos` - Criar novo produto
- **PUT** `/produtos/{id}` - Atualizar produto
- **DELETE** `/produtos/{id}` - Remover produto

### Como Fazer Deploy

Para fazer deploy desta aplicação na Azure, siga o tutorial em: `../TUTORIAL_DEPLOY_AZURE.md`

Para fazer deploy do frontend, siga o tutorial em: `../TUTORIAL_DEPLOY_FRONTEND.md`

---

## 🚀 Como Executar o Projeto Completo

### Pré-requisitos

#### Para o Backend:
- ☕ **Java JDK 17** ou superior instalado
- 🔧 **Maven 3.6+** instalado (ou use o Maven Wrapper incluído)

#### Para o Frontend:
- 📦 **Node.js** e **npm** instalados (recomendado)
- 🌐 **Navegador web** moderno (Chrome, Firefox, Edge, Safari)
- 🐍 **Python 3** (opcional, alternativa ao Node.js)

### 📍 Passo a Passo Completo

#### 1️⃣ Preparar o Ambiente

```bash
# Clone ou baixe o projeto
git clone [seu-repositorio]
cd ProjetoFinal/produtos-api
```

#### 2️⃣ Executar o Backend (API)

**Opção A - Com Maven instalado:**
```bash
# Compilar (opcional)
mvn clean install

# Executar
mvn spring-boot:run
```

**Opção B - Com Maven Wrapper (Windows):**
```bash
# Compilar (opcional)
./mvnw.cmd clean install

# Executar
./mvnw.cmd spring-boot:run
```

**Opção C - Com Maven Wrapper (Linux/Mac):**
```bash
# Compilar (opcional)
./mvnw clean install

# Executar
./mvnw spring-boot:run
```

✅ **Backend rodando em:** `http://localhost:8585`

#### 3️⃣ Executar o Frontend

Abra um **novo terminal** e execute:

**Opção A - Com Node.js (Recomendado):**

```bash
# Navegar para a pasta do frontend
cd frontend

# Instalar dependências (primeira vez apenas)
npm install

# Iniciar servidor
npm start
```

Ou para desenvolvimento:
```bash
npm run dev
```

**Opção B - Com npx (sem instalar dependências):**
```bash
cd frontend
npx http-server -p 8000
```

**Opção C - Com Python:**
```bash
cd frontend
python -m http.server 8000
```

**Opção D - Abrir diretamente:**
- Navegue até `frontend/index.html`
- Abra o arquivo no navegador

✅ **Frontend rodando em:** `http://localhost:8000`

#### 4️⃣ Acessar a Aplicação

- 🌐 **Frontend:** `http://localhost:8000`
- 🔌 **API:** `http://localhost:8585/produtos`
- 📚 **Swagger UI:** `http://localhost:8585/swagger-ui.html`
- 📖 **API Docs (JSON):** `http://localhost:8585/api-docs`
- 🗄️ **H2 Console:** `http://localhost:8585/h2-console`

---

## 📁 Estrutura Completa do Projeto

```
📦 produtos-api
 ┣ 📂 src
 ┃ ┣ 📂 main
 ┃ ┃ ┣ 📂 java/com/exemplo/produtosapi
 ┃ ┃ ┃ ┣ 📂 controller
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoController.java         # Controller (usa Service + DTOs)
 ┃ ┃ ┃ ┃ ┗ 📜 RestExceptionHandler.java      # Handler global (404)
 ┃ ┃ ┃ ┣ 📂 dto
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoRequestDTO.java         # DTO de entrada
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoResponseDTO.java        # DTO de saída
 ┃ ┃ ┃ ┣ 📂 exception
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoNotFoundException.java  # Exceção customizada
 ┃ ┃ ┃ ┣ 📂 mapper
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoMapper.java             # Conversão DTO ↔ Entity
 ┃ ┃ ┃ ┣ 📂 model
 ┃ ┃ ┃ ┃ ┗ 📜 Produto.java              # Entidade JPA
 ┃ ┃ ┃ ┣ 📂 repository
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoRepository.java    # Interface JPA Repository
 ┃ ┃ ┃ ┣ 📂 service
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoCommandService.java     # ISP (commands)
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoQueryService.java       # ISP (queries)
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoService.java            # Interface agregadora (compat)
 ┃ ┃ ┃ ┣ 📂 service/impl
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoServiceImpl.java        # Implementação alternativa (LSP)
 ┃ ┃ ┃ ┃ ┗ 📜 ProdutoServiceV2Impl.java      # Implementação principal (@Primary)
 ┃ ┃ ┃ ┣ 📂 service/rules
 ┃ ┃ ┃ ┃ ┣ 📜 ProdutoRule.java               # OCP (contrato de regras)
 ┃ ┃ ┃ ┃ ┣ 📜 NomeObrigatorioRule.java
 ┃ ┃ ┃ ┃ ┣ 📜 PrecoPositivoRule.java
 ┃ ┃ ┃ ┃ ┗ 📜 QuantidadeNaoNegativaRule.java
 ┃ ┃ ┃ ┣ 📂 config
 ┃ ┃ ┃ ┃ ┣ 📜 CorsConfig.java                 # Configuração global de CORS
 ┃ ┃ ┃ ┃ ┣ 📜 DataInitializer.java             # Seed (20 produtos)
 ┃ ┃ ┃ ┃ ┣ 📜 H2ConsoleConfig.java             # Configuração do H2 Console
 ┃ ┃ ┃ ┃ ┗ 📜 SwaggerConfig.java               # Configuração do Swagger/OpenAPI
 ┃ ┃ ┃ ┗ 📜 ProdutosApiApplication.java        # Classe principal Spring Boot
 ┃ ┃ ┗ 📂 resources
 ┃ ┃   ┗ 📜 application.properties       # Configurações da aplicação
 ┃ ┗ 📂 test
 ┃   ┗ 📂 java/com/exemplo/produtosapi
 ┃     ┗ 📜 ProdutosApiApplicationTests.java
 ┣ 📂 frontend
 ┃ ┣ 📜 index.html                       # Interface web principal
 ┃ ┣ 📜 style.css                        # Estilos customizados
 ┃ ┣ 📜 script.js                        # Lógica JavaScript (CRUD)
 ┃ ┣ 📜 package.json                     # Dependências Node.js
 ┃ ┗ 📜 package-lock.json                # Lock file do npm
 ┣ 📜 pom.xml                            # Dependências Maven
 ┣ 📜 mvnw                                # Maven Wrapper (Linux/Mac)
 ┣ 📜 mvnw.cmd                            # Maven Wrapper (Windows)
 ┗ 📜 README.md                           # Este arquivo
```

---

## 🔍 Detalhamento dos Componentes

### 🔌 Backend - Spring Boot

#### **`controller/ProdutoController.java`**
- Endpoints REST CRUD
- Depende apenas de interfaces menores (`ProdutoQueryService` e `ProdutoCommandService`) (ISP + DIP)
- Recebe `ProdutoRequestDTO` e retorna `ProdutoResponseDTO`

#### **`controller/RestExceptionHandler.java`**
- Handler global para exceções
- Converte `ProdutoNotFoundException` em **404 Not Found**

#### **`dto/ProdutoRequestDTO.java`**
- DTO de entrada (`nome`, `preco`)

#### **`dto/ProdutoResponseDTO.java`**
- DTO de saída (`id`, `nome`, `preco`)

#### **`service/ProdutoQueryService.java` / `service/ProdutoCommandService.java`**
- Interfaces segregadas (ISP)

#### **`service/impl/ProdutoServiceV2Impl.java`**
- Implementação principal (`@Primary`) (LSP)
- Regras de negócio + acesso ao repository + conversões via mapper
- Executa pipeline de validações (OCP) via `List<ProdutoRule>`

#### **`service/impl/ProdutoServiceImpl.java`**
- Segunda implementação (LSP) — pode substituir a V2 sem quebrar o sistema

#### **`service/rules/*`**
- Regras de validação plugáveis (OCP)

#### **`model/Produto.java`**
- Entidade JPA com atributos: id, nome, preço, quantidade

#### **`repository/ProdutoRepository.java`**
- Interface JPA Repository com métodos CRUD automáticos

#### **`mapper/ProdutoMapper.java`**
- Conversão DTO ↔ Entity

#### **`exception/ProdutoNotFoundException.java`**
- Exceção customizada para “produto não encontrado”

#### **`ProdutosApiApplication.java`**
- Classe principal Spring Boot

#### **`application.properties`**
- Configurações da aplicação (porta 8585, banco de dados H2, JPA)

#### **`config/CorsConfig.java`**
- Configuração global de CORS para todos os endpoints
- Habilita CORS para Swagger e API
- Permite requisições de qualquer origem

#### **`config/H2ConsoleConfig.java`**
- Configuração manual do H2 Console para Spring Boot 4.0.2
- Registra o servlet JakartaWebServlet para acesso ao console

#### **`config/SwaggerConfig.java`**
- Configuração do Swagger/OpenAPI
- Define informações da API (título, versão, descrição)

### 🌐 Frontend - Web

#### **`frontend/index.html`**
- Interface web para gerenciamento de produtos
- Formulário para cadastro e edição
- Lista dinâmica de produtos

#### **`frontend/style.css`**
- Estilos customizados com tema escuro
- Layout responsivo

#### **`frontend/script.js`**
- Funções para operações CRUD
- Comunicação com a API via Fetch API
- Tratamento de erros e validação

#### **`frontend/package.json`**
- Configuração do projeto Node.js
- Scripts npm

---

## 💻 Exemplos de Uso

### 🔌 Testando a API com cURL

#### 1. Criar um produto (POST)
```bash
curl -X POST http://localhost:8585/produtos \
  -H "Content-Type: application/json" \
  -d '{
    "nome": "Notebook Dell",
    "preco": 3500.00
  }'
```

#### 2. Listar produtos
```bash
curl http://localhost:8585/produtos
```

#### 2.1 Buscar produtos por nome (contém, case-insensitive)
```bash
curl "http://localhost:8585/produtos/busca?nome=note"
```

#### 3. Buscar por ID
```bash
curl http://localhost:8585/produtos/1
```

#### 4. Atualizar produto
```bash
curl -X PUT http://localhost:8585/produtos/1 \
  -H "Content-Type: application/json" \
  -d '{"nome": "Notebook Dell Inspiron", "preco": 3800.00}'
```

#### 5. Deletar produto
```bash
curl -X DELETE http://localhost:8585/produtos/1
```

### 🌐 Usando o Frontend

1. Acesse `http://localhost:8000`
2. Use o formulário para cadastrar, editar ou excluir produtos
3. A lista é atualizada automaticamente após cada operação

### 📚 Acessando o Swagger UI

1. Acesse: `http://localhost:8585/swagger-ui.html`
2. Explore todos os endpoints da API
3. Teste os endpoints diretamente pela interface do Swagger
4. Veja a documentação completa da API
5. Use o botão "Try it out" para testar endpoints diretamente

> 💡 **Dica:** O Swagger também está disponível na versão deployada no Azure!
> 
> **URLs:**
> - Local: `http://localhost:8585/swagger-ui.html`
> - Azure: `https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/swagger-ui.html`

### 🗄️ Acessando o H2 Console

1. Acesse: `http://localhost:8585/h2-console`
2. Configure a conexão:
   - **JDBC URL:** `jdbc:h2:file:./data/produtosdb` (local) ou `jdbc:h2:file:/home/data/produtosdb` (Azure)
   - **User Name:** `sa`
   - **Password:** (deixe vazio)
3. Clique em **Connect**
4. Execute queries SQL:
   ```sql
   SELECT * FROM produtos;
   ```

> ⚠️ **Nota:** O H2 Console requer a classe `H2ConsoleConfig` para funcionar corretamente no Spring Boot 4.0.2. Esta versão usa Jakarta EE (não mais javax.servlet), então foi necessário registrar manualmente o servlet do H2 usando `JakartaWebServlet`.
> 
> **URLs:**
> - Local: `http://localhost:8585/h2-console`
> - Azure: `https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/h2-console`

---

## 💾 Persistência de Dados

O sistema utiliza **H2 Database** em modo file com **JPA/Hibernate**:

| Recurso | Descrição | Localização |
|---------|-----------|-------------|
| 🗄️ **H2 Database** | Banco de dados em modo file | `jdbc:h2:file:./data/produtosdb` (local) ou `/home/data/produtosdb` (Azure) |
| 🔧 **H2 Console** | Interface web para visualizar dados | `http://localhost:8585/h2-console` |
| 📚 **Swagger UI** | Documentação interativa da API | `http://localhost:8585/swagger-ui.html` |
| 📖 **API Docs (JSON)** | Documentação OpenAPI em JSON | `http://localhost:8585/api-docs` |
| 🌐 **CORS** | Configuração global de CORS | `CorsConfig.java` |
| 📝 **JPA/Hibernate** | ORM para mapeamento objeto-relacional | Automático via Spring Data JPA |
| 🔄 **Auto DDL** | Criação automática de tabelas | `update` (mantém dados entre execuções) |

**Vantagens:**
- ✅ Não requer instalação de banco de dados
- ✅ Ideal para desenvolvimento e testes
- ✅ Configuração automática pelo Spring Boot
- ✅ Console web para visualização de dados

> ⚠️ **Nota:** O `update` mantém os dados enquanto a aplicação estiver rodando. Os dados são perdidos apenas quando a aplicação é encerrada (banco em memória).

---

## 🎓 Conceitos Aplicados

### Persistência de Dados
- **JPA (Java Persistence API)** - Especificação para persistência de dados
- **Hibernate** - Implementação do JPA (ORM - Object-Relational Mapping)
- **Spring Data JPA** - Abstração sobre JPA para facilitar acesso a dados
- **Repository Pattern** - Padrão de acesso a dados
- **Entity Mapping** - Mapeamento objeto-relacional com anotações

### Backend
- **Spring Boot** - Framework Java para APIs REST
- **REST API** - Arquitetura RESTful com HTTP
- **Dependency Injection** - Injeção de dependências do Spring
- **Arquitetura em camadas** - Controller (DTO) → Service → Repository → Entity
- **SOLID (básico)** - SRP e DIP

### Frontend
- **Frontend Web** - HTML, CSS, JavaScript com Bootstrap
- **Fetch API** - Comunicação assíncrona com backend
- **DOM Manipulation** - Manipulação dinâmica da interface

---

## 🛠️ Tecnologias

### Backend
<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![H2](https://img.shields.io/badge/H2-Database-green?style=for-the-badge)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![REST](https://img.shields.io/badge/API-REST-blue?style=for-the-badge)

</div>

**Dependências:**
- Spring Boot 4.0.2 (Jakarta EE)
- Spring Web MVC
- Spring Data JPA
- H2 Database
- Hibernate (ORM)
- SpringDoc OpenAPI 2.6.0 (Swagger/OpenAPI)

### Frontend
<div align="center">

![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Bootstrap](https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white)

</div>

**Bibliotecas:**
- Bootstrap 5.3.2, Bootstrap Icons, http-server

---

## ⚙️ Configurações Importantes

### 🔧 Novas Configurações Implementadas

#### CORS Global (`CorsConfig.java`)
- Configuração global de CORS para todos os endpoints
- Habilita requisições de qualquer origem
- Necessário para Swagger funcionar corretamente no Azure
- Permite comunicação entre frontend e backend

#### Swagger/OpenAPI (`SwaggerConfig.java`)
- Documentação automática da API
- Interface interativa para testar endpoints
- Versão: SpringDoc OpenAPI 2.6.0 (compatível com Spring Boot 4.0.2)
- Acessível em `/swagger-ui.html` e `/api-docs`

#### H2 Console (`H2ConsoleConfig.java`)
- Configuração manual necessária para Spring Boot 4.0.2
- Usa `JakartaWebServlet` (Jakarta EE)
- Permite acesso web ao banco de dados H2

### Backend - `application.properties`

```properties
spring.application.name=produtos-api
server.port=${PORT:8585}

# H2 Database - modo file para persistência
spring.datasource.url=${SPRING_DATASOURCE_URL:jdbc:h2:file:./data/produtosdb;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE}
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update

# H2 Console
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
spring.h2.console.settings.web-allow-others=true

# Logging
logging.level.root=INFO
logging.level.com.exemplo.produtosapi=DEBUG
logging.level.org.hibernate.SQL=DEBUG

# Swagger/OpenAPI
springdoc.api-docs.path=/api-docs
springdoc.swagger-ui.path=/swagger-ui.html
springdoc.swagger-ui.operationsSorter=method
springdoc.swagger-ui.tagsSorter=alpha
springdoc.swagger-ui.try-it-out-enabled=true
```

> 💡 **Nota:** A configuração usa variáveis de ambiente (`${PORT:8585}`) para funcionar tanto localmente quanto no Azure. No Azure, a variável `PORT` é fornecida automaticamente.

### Frontend - `script.js`

```javascript
const API_BASE_URL = 'http://localhost:8585/produtos';
```

> 💡 **Dica:** Se a API estiver em outra porta, altere a constante `API_BASE_URL` no arquivo `script.js`.

---

## ⚠️ Troubleshooting

### Backend

#### Erro: "Porta 8585 já está em uso"
```bash
# Windows
netstat -ano | findstr :8585
taskkill /PID <PID> /F

# Linux/Mac
lsof -ti:8585 | xargs kill -9
```

#### Erro ao compilar
- Verifique se o Java JDK 17+ está instalado: `java -version`
- Verifique se o Maven está instalado: `mvn -version`
- Use o Maven Wrapper: `./mvnw.cmd` (Windows) ou `./mvnw` (Linux/Mac)

#### API não responde
- Verifique se a aplicação iniciou corretamente
- Confirme que está rodando na porta 8585
- Verifique os logs no console

### Frontend

#### Erro: "Erro ao carregar produtos"
- Verifique se a API está rodando em `http://localhost:8585`
- Confirme que a porta está correta no `script.js`
- Verifique o console do navegador (F12) para erros

#### CORS Error
- CORS está configurado globalmente via `CorsConfig.java`
- O controller também tem `@CrossOrigin(origins = "*")` como redundância
- Se ainda houver problemas, verifique se `CorsConfig` está sendo carregado

#### http-server não encontrado
```bash
# Instale as dependências
cd frontend
npm install

# Ou use npx
npx http-server -p 8000
```

#### Produtos não aparecem
- Verifique se há produtos cadastrados na API
- Teste o endpoint: `http://localhost:8585/produtos`

### Geral

#### Ambos não funcionam juntos
- Sempre inicie o backend antes do frontend
- Backend (8585) e Frontend (8000) devem estar em portas diferentes
- Certifique-se de que CORS está habilitado no backend

#### H2 Console não acessível
- Verifique se a classe `H2ConsoleConfig` está presente
- Certifique-se de que `spring.h2.console.enabled=true` no `application.properties`
- Verifique se `spring.h2.console.settings.web-allow-others=true` está configurado
- Reinicie a aplicação após alterações

#### Swagger não carrega (erro de API FETCH)
- Verifique se `CorsConfig.java` está presente e configurado
- Certifique-se de que a versão do SpringDoc OpenAPI é compatível (2.6.0)
- Verifique os logs do Azure para erros específicos
- Teste o endpoint `/api-docs` diretamente no navegador

---

## ✅ SOLID (resumo rápido)
- **SRP**: cada camada com 1 responsabilidade (controller/service/repository/dto/mapper/rules/exception)
- **OCP**: novas validações podem ser adicionadas criando novas classes `ProdutoRule`
- **LSP**: existem múltiplas implementações de Service (`ProdutoServiceImpl` e `ProdutoServiceV2Impl`)
- **ISP**: controller usa interfaces menores (`ProdutoQueryService`, `ProdutoCommandService`)
- **DIP**: dependências por abstrações (interfaces + injeção do Spring)

---

## 🎯 Estrutura de Respostas HTTP

| Operação | Sucesso | Erro |
|----------|---------|------|
| **GET** (lista) | 200 OK + Array JSON | - |
| **GET** (por ID) | 200 OK + Objeto JSON | 404 Not Found |
| **POST** | 201 Created + Objeto JSON | 400 Bad Request |
| **PUT** | 200 OK + Objeto JSON | 404 Not Found |
| **DELETE** | 204 No Content | 404 Not Found |

---

## 📝 Possíveis Melhorias Futuras

### Backend
- [ ] Validação de dados com Bean Validation (@Valid, @NotNull, etc.)
- [ ] Paginação e ordenação nas listagens
- [ ] Busca de produtos por nome
- [ ] Filtros avançados (por preço, categoria, etc.)
- [ ] Sistema de categorias de produtos
- [ ] Upload de imagens de produtos
- [ ] Sistema de estoque
- [ ] Histórico de alterações
- [ ] Migrar para banco de dados persistente (MySQL, PostgreSQL)
- [ ] Implementar testes unitários (JUnit, Mockito)
- [ ] Implementar testes de integração
- [x] Adicionar documentação Swagger/OpenAPI
- [x] Implementar tratamento de exceções global (@ControllerAdvice)
- [x] Adicionar DTOs (Data Transfer Objects)
- [x] Implementar Service Layer
- [x] Aplicar SOLID (SRP, OCP, LSP, ISP, DIP)
- [ ] Adicionar logging estruturado
- [ ] Implementar cache (Redis)
- [ ] Adicionar autenticação e autorização (Spring Security)

### Frontend
- [ ] Busca e filtros de produtos
- [ ] Paginação na lista de produtos
- [ ] Upload de imagens
- [ ] Modo claro/escuro alternável
- [ ] Mais animações e micro-interações
- [ ] Internacionalização (i18n)
- [ ] Acessibilidade aprimorada (ARIA)
- [ ] Testes automatizados (Jest, Cypress)
- [ ] PWA (Progressive Web App)
- [ ] Service Workers
- [ ] Validação mais robusta de formulários

### Segurança
- [ ] Autenticação JWT
- [x] CORS configurado adequadamente (CorsConfig.java)
- [ ] Rate limiting
- [ ] Validação de inputs
- [ ] Sanitização de dados
- [ ] HTTPS habilitado

### DevOps
- [ ] Docker e Docker Compose
- [ ] CI/CD Pipeline
- [x] Deploy em cloud (Azure)
- [ ] Monitoramento e métricas
- [ ] Health checks

---

## 🎓 Aprendizados

Este projeto proporciona experiência prática em:

### Persistência de Dados
- Configuração de banco de dados H2 em memória
- Criação de entidades JPA com anotações (@Entity, @Id, @GeneratedValue)
- Uso de repositórios Spring Data JPA
- Operações CRUD com JPA (sem SQL manual)
- Gerenciamento automático de schema (ddl-auto)
- Acesso ao banco via H2 Console

### Backend
- Arquitetura de APIs REST com Spring Boot
- Integração entre Controller, Repository e Entity
- Tratamento de respostas HTTP adequadas
- CORS para comunicação com frontend

### Frontend
- Desenvolvimento front-end moderno
- Integração entre frontend e backend via Fetch API
- Validação de formulários client-side

### Padrões e Arquitetura
- Padrões de projeto (MVC, Repository)
- Separação de responsabilidades
- Arquitetura em camadas

---

## 📚 Recursos Adicionais

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 Database](https://www.h2database.com/html/main.html)
- [Bootstrap 5](https://getbootstrap.com/docs/5.3/)

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java, Spring Boot e desenvolvimento web no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---