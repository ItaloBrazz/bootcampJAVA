<div align="center">

# ☕ Cadastro de Pessoas

### Sistema de Registro Pessoal em Java

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)](LICENSE)

</div>

---

## 📋 Sobre o Projeto

Aplicação **Java console** desenvolvida para demonstrar os pilares da **Programação Orientada a Objetos**. Um sistema simples, porém completo, que permite o cadastro e gerenciamento de informações pessoais com validações inteligentes.

> 💡 **Perfeito para:** Estudantes de Java, iniciantes em POO e desenvolvedores buscando revisar conceitos fundamentais

---

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|---------------|-----------|
| 📝 **Cadastro Completo** | Registre nome, data de nascimento e altura |
| ✅ **Validação Inteligente** | Sistema valida automaticamente os dados inseridos |
| 🎂 **Cálculo de Idade** | Idade calculada dinamicamente a partir da data de nascimento |
| 📊 **Exibição Formatada** | Dados apresentados de forma clara e organizada |

---

## 🎯 Conceitos de POO Aplicados

```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Métodos Getters e Setters
✓ Validação de Dados
✓ Manipulação de Datas
```

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd cadastro-pessoas
```

2️⃣ **Compile os arquivos**
```bash
javac *.java
```

3️⃣ **Execute a aplicação**
```bash
java Main2
```

4️⃣ **Interaja com o sistema** seguindo as instruções no console! 🎉

---

## 📁 Estrutura do Projeto

```
📦 cadastro-pessoas
 ┣ 📂 src
 ┃ ┣ 📂 model
 ┃ ┃ ┗ 📜 Pessoa.java          # Modelo da entidade Pessoa
 ┃ ┗ 📂 service
 ┃   ┗ 📜 PessoaService.java   # Lógica de negócio e validações
 ┣ 📜 Main2.java                # Classe principal
 ┗ 📜 README.md                 # Documentação
```

### 🔍 Detalhamento das Classes

**`model/Pessoa.java`**
- Define os atributos (nome, dataNascimento, altura)
- Getters e Setters
- Calcula idade automaticamente
- Formata exibição dos dados

**`service/PessoaService.java`**
- Implementa validações de dados
- Regras de negócio
- Processamento de informações

**`Main2.java`**
- Ponto de entrada da aplicação
- Gerencia interação com usuário
- Instancia e manipula objetos

---

## 💻 Exemplo de Uso

```
=================================
   CADASTRO DE PESSOAS
=================================

Digite o nome: João Silva
Digite a data de nascimento (dd/MM/yyyy): 15/03/1990
Digite a altura (em metros): 1.75

✅ Pessoa cadastrada com sucesso!

--- DADOS DA PESSOA ---
Nome: João Silva
Data de Nascimento: 15/03/1990
Idade: 34 anos
Altura: 1.75m
========================
```

---

## 🎓 Aprendizados

Este projeto proporciona experiência prática em:

- 🧱 Modelagem de classes
- 🔒 Encapsulamento de dados
- ✔️ Validação e tratamento de entradas
- 📅 Manipulação de datas em Java
- 💬 Interação via console

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📝 Possíveis Melhorias Futuras

- [ ] Adicionar persistência de dados (arquivos ou banco de dados)
- [ ] Implementar múltiplos cadastros
- [ ] Criar interface gráfica (GUI)
- [ ] Adicionar mais validações
- [ ] Implementar busca e edição de cadastros

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---