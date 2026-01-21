<div align="center">

# 📚 Biblioteca - CRUD Básico em Java

### Sistema Simples de Gerenciamento de Livros

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![CRUD](https://img.shields.io/badge/CRUD-Basic-green?style=for-the-badge)](https://github.com)
[![Beginner](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Aplicação **Java console** didática e simples para aprender os conceitos fundamentais de **CRUD** (Create, Read, Update, Delete). Perfeito para quem está começando com **Programação Orientada a Objetos** e manipulação de listas em Java.

> 🎓 **Ideal para:** Iniciantes em Java, estudantes aprendendo CRUD e manipulação de coleções

---

## ✨ Funcionalidades

### 📊 Operações CRUD

| Operação | Descrição | Ícone |
|----------|-----------|-------|
| **Create** | Adicionar novos livros ao acervo | ➕ |
| **Read** | Listar todos os livros cadastrados | 📋 |
| **Update** | Atualizar informações de livros | ✏️ |
| **Delete** | Remover livros da biblioteca | 🗑️ |

### 📖 Dados do Livro

Cada livro possui as seguintes informações:

```java
✓ Título
✓ Autor
✓ Ano de Publicação
✓ Disponibilidade (Disponível/Emprestado)
```

---

## 🎯 Características

- 🎮 **Menu interativo** no console
- 💾 **Armazenamento em memória** (dados temporários)
- ✅ **Validações básicas** de entrada
- 🧩 **Código simples e didático**
- 📝 **Ideal para aprendizado**

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd biblioteca-crud-basico
```

2️⃣ **Compile o arquivo principal**
```bash
javac Main.java
```

3️⃣ **Execute a aplicação**
```bash
java Main
```

4️⃣ **Navegue pelo menu** e gerencie seus livros! 📚

---

## 📁 Estrutura do Projeto

```
📦 biblioteca-crud-basico
 ┣ 📜 Main.java        # Classe principal com menu e lógica CRUD
 ┣ 📜 Livro.java       # Classe que representa a entidade Livro
 ┗ 📜 README.md        # Documentação
```

### 🔍 Detalhamento

**`Main.java`**
- Ponto de entrada da aplicação
- Menu interativo no console
- Implementação das operações CRUD
- Gerenciamento da lista de livros em memória
- Interação com o usuário

**`Livro.java` (classe interna ou separada)**
- Atributos: título, autor, ano, disponibilidade
- Getters e Setters
- Construtor
- Método toString() para exibição

---

## 💻 Exemplo de Uso

```
=========================================
      SISTEMA DE BIBLIOTECA
=========================================

--- MENU PRINCIPAL ---
1. ➕ Adicionar livro
2. 📋 Listar livros
3. ✏️ Atualizar livro
4. 🗑️ Remover livro
0. 🚪 Sair

Escolha uma opção: 1

--- ADICIONAR NOVO LIVRO ---
Título: O Senhor dos Anéis
Autor: J.R.R. Tolkien
Ano: 1954
Disponível? (S/N): S

✅ Livro adicionado com sucesso!

=========================================

Escolha uma opção: 2

--- LISTA DE LIVROS ---

📖 Livro #1
   Título: O Senhor dos Anéis
   Autor: J.R.R. Tolkien
   Ano: 1954
   Status: ✅ Disponível

📖 Livro #2
   Título: 1984
   Autor: George Orwell
   Ano: 1949
   Status: 🔒 Emprestado

Total de livros: 2

=========================================

Escolha uma opção: 3

--- ATUALIZAR LIVRO ---
Digite o número do livro: 2

Livro selecionado: 1984

Novo título (Enter para manter): 
Novo autor (Enter para manter): 
Novo ano (Enter para manter): 
Disponível? (S/N/Enter para manter): S

✅ Livro atualizado com sucesso!

=========================================

Escolha uma opção: 4

--- REMOVER LIVRO ---
Digite o número do livro: 1

Confirma a remoção de "O Senhor dos Anéis"? (S/N): S

✅ Livro removido com sucesso!

=========================================
```

---

## 🎓 Conceitos de POO Aplicados

```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Getters e Setters
✓ ArrayList (Collections)
✓ Iteração de Listas
✓ Métodos toString()
✓ Entrada/Saída no Console (Scanner)
```

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Collections](https://img.shields.io/badge/Collections-ArrayList-blue?style=for-the-badge)
![Console](https://img.shields.io/badge/Interface-Console-green?style=for-the-badge)

</div>

---

## 💡 Aprendizados

Este projeto ensina na prática:

- 🧱 Criação e manipulação de objetos
- 📚 Uso de ArrayList para armazenar dados
- 🔄 Implementação de operações CRUD
- 🎮 Criação de menus interativos
- ✔️ Validação de entrada do usuário
- 🖥️ Interação via Scanner
- 🏗️ Estruturação básica de projetos Java

---

## ⚠️ Limitações (Propositais para Aprendizado)

- 💾 Dados são **perdidos** ao fechar o programa (sem persistência)
- 🔍 Não possui sistema de busca avançada
- 🔐 Não possui autenticação ou segurança
- 📊 Sem validações complexas

> **Nota:** Estas limitações são intencionais para manter o projeto simples e focado nos conceitos básicos de CRUD.

---

## 📝 Próximos Passos e Melhorias

Após dominar este projeto, você pode evoluí-lo:

### Nível Intermediário
- [ ] Adicionar persistência em arquivos de texto
- [ ] Implementar sistema de busca (por título, autor)
- [ ] Adicionar validações mais robustas
- [ ] Criar categorias/gêneros de livros
- [ ] Implementar ordenação da lista

### Nível Avançado
- [ ] Migrar para banco de dados (MySQL, SQLite)
- [ ] Adicionar autenticação de usuários
- [ ] Criar interface gráfica (JavaFX ou Swing)
- [ ] Implementar sistema de empréstimos
- [ ] Desenvolver API REST

---

## 🎯 Objetivo Didático

Este projeto foi criado especificamente para praticar:

- ✅ **Lógica de programação** com casos reais
- ✅ **Manipulação de listas** em Java
- ✅ **Estruturação de código** limpo e organizado
- ✅ **Boas práticas** de programação
- ✅ **Fundamentos de CRUD** que são base para qualquer sistema

---

## 🔧 Dicas de Estudo

1. **Entenda o fluxo**: Acompanhe como cada operação CRUD funciona
2. **Modifique o código**: Adicione novos campos ou funcionalidades
3. **Teste cenários**: Tente quebrar o programa para aprender validações
4. **Refatore**: Melhore o código conforme aprende novos conceitos
5. **Documente**: Adicione comentários explicando sua lógica

---

## 🤝 Contribuindo

Sinta-se à vontade para:

- 🐛 Reportar bugs
- 💡 Sugerir melhorias
- 🔧 Fazer fork e criar sua versão
- 📚 Usar como base para outros projetos

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Livre para uso educacional e comercial.

---