<div align="center">

# 🛍️ Sistema de Gerenciamento de Produtos

### API REST + Frontend Web Completo

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![REST API](https://img.shields.io/badge/API-REST-green?style=for-the-badge)](https://github.com)
[![H2](https://img.shields.io/badge/H2-Database-green?style=for-the-badge)](https://www.h2database.com/)

</div>

---

## 📋 Sobre o Projeto

Sistema completo de gerenciamento de produtos composto por:

- **Backend:** API REST desenvolvida com **Spring Boot**
- **Frontend:** Interface web moderna e responsiva hospedada junto ao backend
- **Persistência:** Banco de dados H2 com **JPA/Hibernate**
- **Arquitetura:** Controller + DTOs + Service Layer + Repository (SOLID completo)
- **CI/CD:** Deploy automático via GitHub Actions para Azure

---

## 🌐 Aplicação em Produção

**Frontend + Backend:** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/

**Swagger UI:** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/swagger-ui.html

**API Docs (JSON):** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/api-docs

**H2 Console:** https://bootcamp-produtos-italobraz-avguhkbtcebtceap.canadacentral-01.azurewebsites.net/h2-console

---

## ✨ Funcionalidades

### 🔌 Backend - API REST

| Método HTTP | Endpoint | Descrição |
|------------|----------|-----------|
| **GET** | `/produtos` | Lista todos os produtos |
| **GET** | `/produtos/{id}` | Busca produto por ID |
| **GET** | `/produtos/busca?nome=...` | Busca produto por nome |
| **POST** | `/produtos` | Cria novo produto |
| **PUT** | `/produtos/{id}` | Atualiza produto existente |
| **DELETE** | `/produtos/{id}` | Remove produto |

### 🌐 Frontend - Interface Web

- ✅ Listar, cadastrar, editar e excluir produtos
- ✅ Interface responsiva (desktop e mobile)
- ✅ Modo claro/escuro
- ✅ Busca por nome
- ✅ Dashboard com total de itens cadastrados
- ✅ Feedback visual em todas as operações

---

## 🚀 Como Executar Localmente

### Pré-requisitos

- ☕ **Java JDK 17+**
- 🔧 **Maven 3.6+** (ou use o Maven Wrapper incluído)

### Executar o Projeto

```bash
# Navegar para a pasta do projeto
cd ProjetoFinal/produtos-api

# Executar com Maven Wrapper (Windows)
.\mvnw.cmd spring-boot:run

# Executar com Maven Wrapper (Linux/Mac)
./mvnw spring-boot:run

# Ou com Maven instalado
mvn spring-boot:run
```

✅ **Aplicação rodando em:** `http://localhost:8585`

O frontend está hospedado junto ao backend em `src/main/resources/static/`, então ao acessar `http://localhost:8585` você verá a interface web completa.

### Acessar Recursos

- 🌐 **Frontend:** `http://localhost:8585`
- 🔌 **API:** `http://localhost:8585/produtos`
- 📚 **Swagger UI:** `http://localhost:8585/swagger-ui.html`
- 📖 **API Docs:** `http://localhost:8585/api-docs`
- 🗄️ **H2 Console:** `http://localhost:8585/h2-console`

**Credenciais H2:**
- JDBC URL: `jdbc:h2:file:./data/produtosdb`
- User: `sa`
- Password: (deixe vazio)

---

## 🛠️ Tecnologias

### Backend
- **Spring Boot 4.0.2** (Jakarta EE)
- **Spring Data JPA** + **Hibernate**
- **H2 Database**
- **SpringDoc OpenAPI 2.7.0** (Swagger)
- **Maven**

### Frontend
- **HTML5**, **CSS3**, **JavaScript**
- **Bootstrap 5.3.2**
- **Bootstrap Icons**

---

## 📁 Estrutura do Projeto

```
produtos-api/
├── src/main/
│   ├── java/com/exemplo/produtosapi/
│   │   ├── controller/          # Endpoints REST
│   │   ├── service/              # Lógica de negócio
│   │   ├── repository/           # Acesso a dados
│   │   ├── dto/                  # Data Transfer Objects
│   │   ├── model/                # Entidades JPA
│   │   ├── config/               # Configurações (CORS, Swagger, H2)
│   │   └── exception/            # Exceções customizadas
│   └── resources/
│       ├── static/               # Frontend (HTML, CSS, JS)
│       └── application.properties
├── pom.xml
└── README.md
```

---

## 🔄 CI/CD

O projeto possui **CI/CD configurado** com GitHub Actions:

- ✅ Build automático com Maven
- ✅ Deploy automático para Azure App Service
- ✅ Executa a cada push na branch `main`
- ✅ Workflow em `.github/workflows/deploy-azure.yml`

Para configurar, veja o tutorial em `../TUTORIAL_CI_CD.md`

---

## 💻 Exemplo de Uso da API

### Criar produto
```bash
curl -X POST http://localhost:8585/produtos \
  -H "Content-Type: application/json" \
  -d '{"nome": "Notebook Dell", "preco": 3500.00, "quantidade": 10}'
```

### Listar produtos
```bash
curl http://localhost:8585/produtos
```

### Buscar por nome
```bash
curl "http://localhost:8585/produtos/busca?nome=note"
```

---

## 🎓 Conceitos Aplicados

- **JPA/Hibernate** - Persistência de dados
- **REST API** - Arquitetura RESTful
- **SOLID** - Princípios de design
- **DTOs** - Separação de contratos
- **Service Layer** - Lógica de negócio
- **Exception Handling** - Tratamento global de exceções
- **CORS** - Configuração para comunicação frontend/backend

---

## 👨‍💻 Autor

**Ítalo Braz**

- 📧 LinkedIn: [linkedin.com/in/italobraz](https://www.linkedin.com/in/italobraz/)
- 📷 Instagram: [@jtalobraz](https://www.instagram.com/jtalobraz/)

---

## 📄 Licença

Este projeto está sob a licença MIT.
