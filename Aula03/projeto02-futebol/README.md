<div align="center">

# ⚽ Sistema de Jogadores de Futebol

### Gerenciamento Completo de Atletas Profissionais

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![Sports](https://img.shields.io/badge/Sports-Football-green?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Sistema **Java console** para gerenciamento de jogadores de futebol profissional, desenvolvido com foco em **Programação Orientada a Objetos**. A aplicação simula um ambiente real de gestão esportiva com cálculos específicos para carreira de atletas.

> ⚽ **Ideal para:** Estudantes de Java, entusiastas de futebol e desenvolvedores aprendendo POO com contexto prático

---

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|---------------|-----------|
| ⚽ **Cadastro de Jogadores** | Registre atletas com dados completos |
| 📋 **Listagem Completa** | Visualize todos os jogadores cadastrados |
| 🔍 **Consulta Detalhada** | Acesse informações específicas de cada jogador |
| 🎂 **Cálculo de Idade** | Idade calculada automaticamente |
| 🏆 **Previsão de Aposentadoria** | Estime tempo restante de carreira por posição |

---

## 📊 Dados do Jogador

Cada jogador possui os seguintes atributos:

```java
✓ Nome
✓ Posição (Defesa, Meio-campo, Atacante)
✓ Data de Nascimento
✓ Nacionalidade
✓ Altura (em metros)
✓ Peso (em kg)
```

---

## 🎯 Regras de Aposentadoria

O sistema calcula o tempo restante de carreira baseado em estatísticas reais do futebol:

| Posição | Idade de Aposentadoria | Ícone |
|---------|------------------------|-------|
| 🛡️ **Defesa** | 40 anos | Experiência e posicionamento |
| ⚙️ **Meio-campo** | 38 anos | Equilíbrio entre físico e técnica |
| 🎯 **Atacante** | 35 anos | Velocidade e explosão |

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd sistema-jogadores-futebol
```

2️⃣ **Compile os arquivos**
```bash
javac src/**/*.java
```

3️⃣ **Execute a aplicação**
```bash
java -cp src Main3
```

4️⃣ **Navegue pelo menu interativo** e gerencie seus jogadores! ⚽

---

## 📁 Estrutura do Projeto

```
📦 sistema-jogadores-futebol
 ┣ 📂 src
 ┃ ┣ 📂 model
 ┃ ┃ ┗ 📜 Jogador.java           # Modelo da entidade Jogador
 ┃ ┣ 📂 service
 ┃ ┃ ┗ 📜 JogadorService.java    # Lógica de negócio e cálculos
 ┃ ┗ 📜 Main3.java                # Classe principal
 ┗ 📜 README.md                   # Documentação
```

### 🔍 Detalhamento das Classes

**`model/Jogador.java`**
- Define os atributos do jogador
- Getters e Setters
- Representação do atleta profissional
- Formatação de dados

**`service/JogadorService.java`**
- Validações de dados
- Cálculo de idade
- Cálculo de tempo para aposentadoria
- Regras de negócio específicas do futebol
- Gerenciamento da lista de jogadores

**`Main3.java`**
- Ponto de entrada da aplicação
- Menu interativo
- Coordena as operações do sistema
- Interface com o usuário

---

## 💻 Exemplo de Uso

```
=========================================
   SISTEMA DE JOGADORES DE FUTEBOL
=========================================

--- MENU PRINCIPAL ---
1. Cadastrar novo jogador
2. Listar todos os jogadores
3. Ver detalhes de um jogador
4. Calcular idade
5. Tempo para aposentadoria
0. Sair

Escolha uma opção: 1

--- CADASTRO DE JOGADOR ---
Nome: Cristiano Ronaldo
Posição (Defesa/Meio-campo/Atacante): Atacante
Data de Nascimento (dd/MM/yyyy): 05/02/1985
Nacionalidade: Português
Altura (m): 1.87
Peso (kg): 84

✅ Jogador cadastrado com sucesso!

=========================================

Escolha uma opção: 5

Digite o nome do jogador: Cristiano Ronaldo

⚽ Cristiano Ronaldo (Atacante)
📅 Idade atual: 39 anos
🏆 Aposentadoria prevista para: 35 anos
⏱️ Tempo de carreira restante: Já passou da idade de aposentadoria

=========================================
```

---

## 🎓 Conceitos de POO Aplicados

```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Métodos Getters e Setters
✓ Validação de Dados
✓ Enumerações (Posições)
✓ Cálculos com Datas
✓ Lógica de Negócio em Services
✓ Separação de Responsabilidades (MVC Pattern)
```

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📝 Possíveis Melhorias Futuras

- [ ] Adicionar mais posições (Goleiro, Lateral, Volante)
- [ ] Implementar persistência em banco de dados
- [ ] Criar histórico de clubes do jogador
- [ ] Adicionar estatísticas (gols, assistências, cartões)
- [ ] Implementar sistema de busca avançada
- [ ] Criar interface gráfica (GUI)
- [ ] Exportar relatórios em PDF
- [ ] Sistema de transferências entre clubes
- [ ] Comparação entre jogadores

---

## 🎯 Aprendizados

Este projeto proporciona experiência prática em:

- 🧱 Modelagem de domínio (futebol)
- 🔒 Encapsulamento e organização de código
- ✔️ Validação contextual de dados
- 📅 Manipulação avançada de datas
- 🎯 Lógica de negócio específica de domínio
- 📊 Cálculos baseados em regras reais
- 🏗️ Arquitetura em camadas (Model-Service-Controller)

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---