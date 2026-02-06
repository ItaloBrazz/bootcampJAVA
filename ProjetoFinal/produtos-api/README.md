<div align="center">

# 🛍️ Sistema de Gerenciamento de Produtos

API REST com Spring Boot + Frontend Web (servindo em `resources/static`).

</div>

## 🌐 Links (Produção)

- **App (Frontend + API)**: `https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/`
- **Swagger UI**: `https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/swagger-ui.html`
- **OpenAPI JSON**: `https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/api-docs`

## ✨ Funcionalidades (resumo)

- **CRUD de Produtos** (API REST)
- **Busca por nome** (`/produtos/busca?nome=...`)
- **Frontend responsivo** com modo claro/escuro e total de itens

## 🔌 Endpoints principais

- `GET /produtos`
- `GET /produtos/{id}`
- `GET /produtos/busca?nome=...`
- `POST /produtos`
- `PUT /produtos/{id}`
- `DELETE /produtos/{id}`

## 🧱 Stack

- **Java 17**
- **Spring Boot 4.0.2**
- **Spring Data JPA / Hibernate**
- **H2 Database (file)**
- **SpringDoc OpenAPI 2.7.0**
- **Frontend**: HTML/CSS/JS + Bootstrap (servindo em `src/main/resources/static/`)

## 🚀 Rodando localmente

### Pré-requisitos

- Java 17+
- Maven (ou Maven Wrapper)

### Subir a aplicação

> Importante: rode os comandos **dentro** da pasta `ProjetoFinal/produtos-api`.

```bash
cd ProjetoFinal/produtos-api

# Windows (Wrapper)
.\mvnw.cmd spring-boot:run

# Linux/Mac (Wrapper)
./mvnw spring-boot:run

# Ou Maven instalado
mvn spring-boot:run
```

### Acessos locais

- **Frontend**: `http://localhost:8585/`
- **Swagger**: `http://localhost:8585/swagger-ui.html`
- **API Docs**: `http://localhost:8585/api-docs`
- **H2 Console**: `http://localhost:8585/h2-console`

## 🗄️ Banco de dados (config atual)

Por padrão, o projeto usa **H2 em arquivo** com esta URL (do `application.properties`):

- JDBC URL: `jdbc:h2:file:/home/data/produtosdb;AUTO_SERVER=TRUE;DB_CLOSE_ON_EXIT=FALSE`
- User: `sa`
- Password: (vazio)

### Onde os dados ficam

- **Azure App Service**: `/home/data/produtosdb.mv.db` (persistente)
- **Windows local**: vira um caminho absoluto no drive (ex.: `C:\home\data\produtosdb.mv.db`)

> Se quiser apontar para outro local/banco, sobrescreva via variável de ambiente `SPRING_DATASOURCE_URL`.

## 🔄 CI/CD (GitHub Actions → Azure)

Workflow: `.github/workflows/deploy-azure.yml`

Secrets esperados:

- `AZURE_WEBAPP_NAME`
- `AZURE_RESOURCE_GROUP`
- `AZURE_CLIENT_ID`
- `AZURE_CLIENT_SECRET`
- `AZURE_SUBSCRIPTION_ID`
- `AZURE_TENANT_ID`

## 👨‍💻 Autor

**Ítalo Braz**

- LinkedIn: `https://www.linkedin.com/in/italobraz/`
- Instagram: `https://www.instagram.com/jtalobraz/`
