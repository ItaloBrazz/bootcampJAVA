# 📚 Desafio CRUD – Biblioteca em Java

Bem-vindo ao **Desafio-CRUD**!
Este projeto é uma aplicação em **Java** para gerenciamento de livros, agora com autenticação de administrador e persistência de dados em arquivos.

---

## 🚀 Funcionalidades

Com este sistema você pode:

*   🔐 **Autenticação** de administrador para acesso ao sistema.
*   👤 **Cadastro** de novos administradores.
*   ➕ **Adicionar** livros informando título, autor, ano e disponibilidade.
*   📋 **Listar** todos os livros cadastrados.
*   ✏️ **Atualizar** dados de um livro existente.
*   🗑️ **Remover** livros da biblioteca.

Tudo isso através de um menu interativo no terminal.

---

## 🛠️ Tecnologias Utilizadas

*   ☕ Java
*   🧩 Programação Orientada a Objetos
*   💾 Persistência de dados em arquivos de texto.
*   💻 Execução via terminal/console.

---

## ▶️ Como Executar

1.  Compile os arquivos fontes a partir da pasta `src`:

    ```bash
    javac -d ../out/production/Desafio ./src/Main.java ./src/model/Admin.java ./src/model/Livro.java ./src/service/AuthService.java ./src/service/BibliotecaService.java
    ```

2.  Execute o programa a partir da pasta `src`:

    ```bash
    java -cp ../out/production/Desafio Main
    ```

3.  Navegue pelo menu e gerencie seus livros 📖

---

## 📂 Estrutura do Projeto

*   `src/Main.java` → Classe principal com o menu e a interação com o usuário.
*   `src/model/Livro.java` → Classe que representa os dados do livro.
*   `src/model/Admin.java` → Classe que representa os dados do administrador.
*   `src/service/BibliotecaService.java` → Classe que gerencia as operações de CRUD dos livros.
*   `src/service/AuthService.java` → Classe que gerencia a autenticação dos administradores.
*   `data/livros.txt` → Arquivo que armazena os dados dos livros.
*   `data/admins.txt` → Arquivo que armazena os dados dos administradores.

---

## 🎯 Objetivo

Projeto criado para praticar:

*   Lógica de programação
*   Manipulação de listas e arquivos.
*   Estruturação de projetos Java com pacotes.
*   Boas práticas de código.

---

💡 Sinta-se à vontade para melhorar, refatorar e expandir este projeto!
Bons estudos e boas linhas de código 🚀
