<div align="center">

# 📚 Sistema de Biblioteca - CRUD Completo

### Gerenciamento de Acervo Literário com Autenticação

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![CRUD](https://img.shields.io/badge/CRUD-Complete-green?style=for-the-badge)](https://github.com)
[![File System](https://img.shields.io/badge/Storage-File_System-orange?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Sistema **Java console** completo para gerenciamento de bibliotecas com **operações CRUD** (Create, Read, Update, Delete), **autenticação de administradores** e **persistência de dados** em arquivos. Uma aplicação robusta que simula um sistema real de gestão de acervos literários.

> 📖 **Ideal para:** Estudantes aprendendo CRUD, manipulação de arquivos, autenticação e arquitetura em camadas

---

## ✨ Funcionalidades

### 🔐 Autenticação e Segurança

| Funcionalidade | Descrição |
|---------------|-----------|
| 🔑 **Login de Administrador** | Acesso seguro ao sistema |
| 👤 **Cadastro de Admin** | Registre novos administradores |
| 🛡️ **Proteção de Dados** | Apenas admins autenticados podem gerenciar livros |

### 📚 Gerenciamento de Livros (CRUD)

| Operação | Descrição | Ícone |
|----------|-----------|-------|
| **Create** | Adicionar novos livros ao acervo | ➕ |
| **Read** | Listar todos os livros cadastrados | 📋 |
| **Update** | Atualizar informações de livros | ✏️ |
| **Delete** | Remover livros da biblioteca | 🗑️ |

### 📊 Dados Gerenciados

**Informações do Livro:**
```java
✓ Título
✓ Autor
✓ Ano de Publicação
✓ Disponibilidade (Disponível/Emprestado)
```

**Informações do Admin:**
```java
✓ Nome de Usuário
✓ Senha
```

---

## 💾 Persistência de Dados

O sistema utiliza **arquivos de texto** para armazenamento permanente:

| Arquivo | Conteúdo | Localização |
|---------|----------|-------------|
| 📁 `livros.txt` | Dados de todos os livros | `data/livros.txt` |
| 📁 `admins.txt` | Credenciais dos administradores | `data/admins.txt` |

**Vantagens:**
- ✅ Dados persistem entre execuções
- ✅ Não requer banco de dados
- ✅ Fácil visualização e debug
- ✅ Simples para aprendizado

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd desafio-crud-biblioteca
```

2️⃣ **Compile os arquivos (a partir da pasta `src`)**
```bash
javac -d ../out/production/Desafio ./src/Main.java ./src/model/Admin.java ./src/model/Livro.java ./src/service/AuthService.java ./src/service/BibliotecaService.java
```

3️⃣ **Execute a aplicação (a partir da pasta `src`)**
```bash
java -cp ../out/production/Desafio Main
```

4️⃣ **Faça login ou cadastre um administrador** e comece a gerenciar sua biblioteca! 📚

---

## 📁 Estrutura do Projeto

```
📦 desafio-crud-biblioteca
 ┣ 📂 src
 ┃ ┣ 📂 model
 ┃ ┃ ┣ 📜 Livro.java              # Modelo da entidade Livro
 ┃ ┃ ┗ 📜 Admin.java              # Modelo da entidade Administrador
 ┃ ┣ 📂 service
 ┃ ┃ ┣ 📜 BibliotecaService.java  # CRUD de livros + persistência
 ┃ ┃ ┗ 📜 AuthService.java        # Autenticação de administradores
 ┃ ┗ 📜 Main.java                  # Classe principal e menu
 ┣ 📂 data
 ┃ ┣ 📄 livros.txt                 # Armazena dados dos livros
 ┃ ┗ 📄 admins.txt                 # Armazena credenciais dos admins
 ┣ 📂 out
 ┃ ┗ 📂 production
 ┃   ┗ 📂 Desafio                  # Classes compiladas
 ┗ 📜 README.md                    # Documentação
```

### 🔍 Detalhamento das Classes

**`model/Livro.java`**
- Atributos: título, autor, ano, disponibilidade
- Getters e Setters
- Representação em String para arquivo
- Parsing de dados do arquivo

**`model/Admin.java`**
- Atributos: username, senha
- Getters e Setters
- Métodos de validação
- Serialização para arquivo

**`service/BibliotecaService.java`**
- Operações CRUD completas
- Leitura e escrita em `livros.txt`
- Validações de dados
- Gerenciamento da lista de livros
- Controle de disponibilidade

**`service/AuthService.java`**
- Sistema de autenticação
- Cadastro de novos administradores
- Validação de credenciais
- Persistência em `admins.txt`
- Verificação de usuários existentes

**`Main.java`**
- Ponto de entrada da aplicação
- Menu interativo
- Fluxo de autenticação
- Coordenação entre services
- Interface com o usuário

---

## 💻 Exemplo de Uso

```
=========================================
   SISTEMA DE BIBLIOTECA - CRUD
=========================================

--- AUTENTICAÇÃO ---
1. Login
2. Cadastrar novo administrador
0. Sair

Escolha uma opção: 1

Usuário: admin
Senha: ****

✅ Login realizado com sucesso!
Bem-vindo, admin!

=========================================

--- MENU PRINCIPAL ---
1. ➕ Adicionar livro
2. 📋 Listar livros
3. ✏️ Atualizar livro
4. 🗑️ Remover livro
5. 🔍 Buscar livro
0. 🚪 Sair

Escolha uma opção: 1

--- ADICIONAR NOVO LIVRO ---
Título: Clean Code
Autor: Robert C. Martin
Ano: 2008
Disponível? (S/N): S

✅ Livro cadastrado com sucesso!

=========================================

Escolha uma opção: 2

--- LISTA DE LIVROS ---

📖 ID: 1
   Título: Clean Code
   Autor: Robert C. Martin
   Ano: 2008
   Status: ✅ Disponível

📖 ID: 2
   Título: Design Patterns
   Autor: Gang of Four
   Ano: 1994
   Status: 🔒 Emprestado

Total de livros: 2

=========================================

Escolha uma opção: 3

--- ATUALIZAR LIVRO ---
Digite o ID do livro: 2

Livro encontrado: Design Patterns

Novo título (Enter para manter): 
Novo autor (Enter para manter): 
Novo ano (Enter para manter): 
Disponível? (S/N/Enter para manter): S

✅ Livro atualizado com sucesso!

=========================================
```

---

## 🎓 Conceitos Aplicados

### Programação Orientada a Objetos
```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Getters e Setters
✓ Métodos de Negócio
✓ Separação de Responsabilidades
```

### Arquitetura e Padrões
```java
✓ Arquitetura em Camadas (Model-Service-Controller)
✓ Service Layer Pattern
✓ Data Access Object (DAO) Pattern
✓ Separation of Concerns
```

### Manipulação de Dados
```java
✓ CRUD Completo
✓ Leitura e Escrita de Arquivos
✓ Parsing e Serialização
✓ Validação de Dados
✓ Tratamento de Exceções
```

### Segurança Básica
```java
✓ Sistema de Autenticação
✓ Validação de Credenciais
✓ Controle de Acesso
```

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![File System](https://img.shields.io/badge/Storage-File_System-green?style=for-the-badge)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📝 Possíveis Melhorias Futuras

### Funcionalidades
- [ ] Sistema de empréstimo com data de devolução
- [ ] Histórico de empréstimos
- [ ] Categorias/Gêneros de livros
- [ ] Sistema de busca avançada (por autor, ano, etc.)
- [ ] Reserva de livros
- [ ] Multas por atraso
- [ ] Relatórios e estatísticas

### Técnicas
- [ ] Migrar para banco de dados (MySQL, PostgreSQL)
- [ ] Implementar criptografia de senhas (BCrypt)
- [ ] Adicionar testes unitários (JUnit)
- [ ] Criar interface gráfica (JavaFX ou Swing)
- [ ] API REST com Spring Boot
- [ ] Sistema de logs
- [ ] Backup automático dos dados
- [ ] Exportação de relatórios em PDF/Excel

### Segurança
- [ ] Diferentes níveis de acesso (admin, bibliotecário, usuário)
- [ ] Tokens de sessão
- [ ] Timeout de inatividade
- [ ] Auditoria de ações

---

## 🎯 Aprendizados

Este projeto proporciona experiência prática em:

- 🧱 Arquitetura de aplicações em camadas
- 💾 Persistência de dados em arquivos
- 🔒 Implementação de autenticação básica
- ✔️ Validações complexas de dados
- 📊 Operações CRUD completas
- 🎮 Menu interativo e UX em console
- 🏗️ Organização de projetos Java
- 📝 Parsing e serialização de dados
- 🚨 Tratamento robusto de erros

---

## 🔧 Tratamento de Erros

O sistema lida adequadamente com:

- ✅ Arquivos de dados inexistentes
- ✅ Credenciais inválidas
- ✅ IDs de livros não encontrados
- ✅ Dados incompletos ou inválidos
- ✅ Problemas de leitura/escrita de arquivos
- ✅ Tentativas de duplicação de dados

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---