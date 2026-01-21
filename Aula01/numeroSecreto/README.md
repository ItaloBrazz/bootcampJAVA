<div align="center">

# 🎲 Jogo do Número Secreto

### Desafio de Adivinhação Interativo

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![Game](https://img.shields.io/badge/Type-Game-purple?style=for-the-badge)](https://github.com)
[![Fun](https://img.shields.io/badge/Fun-Guaranteed-brightgreen?style=for-the-badge)](https://github.com)
[![Beginner](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Jogo **Java console** simples e divertido de **adivinhação de números**. O programa gera um número aleatório entre 1 e 10, e o jogador deve descobrir qual é, recebendo dicas a cada tentativa. Perfeito para aprender lógica de programação, estruturas de repetição e geração de números aleatórios.

> 🎮 **Ideal para:** Iniciantes em Java aprendendo loops, condicionais e interação com usuário

---

## ✨ Funcionalidades

| Funcionalidade | Descrição | Ícone |
|---------------|-----------|-------|
| 🎲 **Número Aleatório** | Geração automática de 1 a 10 | 🔀 |
| 💭 **Dicas Inteligentes** | Informa se o palpite é maior ou menor | 💡 |
| 🎯 **Validação Imediata** | Feedback instantâneo a cada tentativa | ⚡ |
| 🏆 **Vitória** | Jogo termina ao acertar o número | 🎉 |
| 🔄 **Tentativas Ilimitadas** | Continue até descobrir | ♾️ |

---

## 🎮 Como Jogar

1. 🚀 Execute o programa
2. 💭 O sistema gera um número secreto de 1 a 10
3. 🤔 Faça seu palpite
4. 📊 Receba uma dica:
    - ⬇️ "O número é **menor**!"
    - ⬆️ "O número é **maior**!"
    - 🎉 "**Parabéns! Você acertou!**"
5. 🔄 Continue tentando até acertar
6. 🏆 Veja quantas tentativas você usou!

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd numeroSecreto
```

2️⃣ **Compile o arquivo principal**
```bash
javac src/Main.java -d out/production/untitled
```

3️⃣ **Execute o jogo**
```bash
java -cp out/production/untitled Main
```

4️⃣ **Divirta-se** tentando descobrir o número secreto! 🎲

---

## 📁 Estrutura do Projeto

```
📦 numeroSecreto
 ┣ 📂 .idea
 ┃ ┣ 📜 .gitignore
 ┃ ┣ 📜 misc.xml
 ┃ ┗ 📜 modules.xml
 ┣ 📂 src
 ┃ ┗ 📜 Main.java              # Classe principal do jogo
 ┣ 📂 out
 ┃ ┗ 📂 production
 ┃   ┗ 📂 untitled
 ┃     ┗ 📜 Main.class          # Classe compilada
 ┣ 📜 .gitignore
 ┣ 📜 untitled.iml
 ┗ 📜 README.md                 # Documentação
```

### 🔍 Detalhamento

**`src/Main.java`**
- Geração de número aleatório (1-10)
- Loop de tentativas
- Comparação de valores
- Sistema de dicas
- Contagem de tentativas
- Mensagens de feedback

---

## 💻 Exemplo de Jogo

```
=========================================
      🎲 JOGO DO NÚMERO SECRETO
=========================================

Bem-vindo ao jogo!
Estou pensando em um número de 1 a 10...
Tente adivinhar! 🤔

=========================================

Digite seu palpite: 5

⬆️ O número secreto é MAIOR que 5!

Digite seu palpite: 8

⬇️ O número secreto é MENOR que 8!

Digite seu palpite: 7

⬇️ O número secreto é MENOR que 7!

Digite seu palpite: 6

🎉 PARABÉNS! Você acertou! 🎉

O número secreto era: 6
Você usou 4 tentativas!

Quer jogar novamente? (S/N): S

=========================================

Novo jogo iniciado!
Estou pensando em um número de 1 a 10...

Digite seu palpite: 3

⬆️ O número secreto é MAIOR que 3!

...
```

---

## 🎓 Conceitos de Programação Aplicados

```java
✓ Estruturas de Repetição (while/do-while)
✓ Estruturas Condicionais (if/else)
✓ Classe Random (geração aleatória)
✓ Scanner (entrada de dados)
✓ Operadores Relacionais (>, <, ==)
✓ Variáveis e Tipos de Dados
✓ Lógica Booleana
✓ Tratamento de Entrada do Usuário
```

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Random](https://img.shields.io/badge/Random-Number_Generator-purple?style=for-the-badge)

</div>

---

## 💡 Aprendizados

Este projeto ensina na prática:

- 🎲 Geração de números aleatórios com `Random`
- 🔄 Uso de loops para repetição
- ❓ Estruturas condicionais para decisões
- 📥 Captura de entrada do usuário com `Scanner`
- 🧠 Lógica de comparação e feedback
- 🎮 Desenvolvimento de jogos simples
- 💬 Interação via console

---

## 📝 Próximos Passos e Melhorias

### Nível Básico
- [ ] Adicionar contador de tentativas
- [ ] Implementar opção "jogar novamente"
- [ ] Validar entrada (somente números)
- [ ] Adicionar mensagem de boas-vindas

### Nível Intermediário
- [ ] Permitir escolher o intervalo de números
- [ ] Adicionar níveis de dificuldade (fácil, médio, difícil)
- [ ] Implementar sistema de pontuação
- [ ] Criar ranking de melhores jogadas
- [ ] Adicionar limite de tentativas
- [ ] Salvar recordes em arquivo

### Nível Avançado
- [ ] Interface gráfica com JavaFX
- [ ] Modo multiplayer (2 jogadores)
- [ ] Sistema de conquistas/badges
- [ ] Sons e efeitos visuais
- [ ] Histórico de partidas
- [ ] Diferentes modos de jogo
- [ ] Timer para adicionar pressão

---

## 🎯 Variações do Jogo

Experimente implementar estas variações:

### 🔥 Modo Difícil
- Intervalo de 1 a 100
- Limite de 7 tentativas
- Sem dicas

### ⚡ Modo Speedrun
- Contra o relógio
- Pontos baseados no tempo
- Menos tentativas = mais pontos

### 🎲 Modo Reverso
- Computador adivinha SEU número
- Você dá as dicas
- IA aprende com suas respostas

---

## 🏆 Desafios Extras

Tente melhorar o jogo:

1. 📊 **Estatísticas**: Mostre média de tentativas
2. 🎨 **Visual**: Adicione cores no terminal
3. 🔊 **Som**: Efeitos sonoros (opcional)
4. 💾 **Persistência**: Salve recordes
5. 🤖 **IA**: Implemente estratégia de busca binária

---

## 🔧 Lógica do Jogo

```java
// Pseudocódigo simplificado
numeroSecreto = gerarNumeroAleatorio(1, 10)
tentativas = 0

enquanto (naoAcertou) {
    palpite = lerPalpiteDoUsuario()
    tentativas++
    
    se (palpite < numeroSecreto) {
        mostrar("O número é MAIOR!")
    } senao se (palpite > numeroSecreto) {
        mostrar("O número é MENOR!")
    } senao {
        mostrar("PARABÉNS! Acertou em " + tentativas + " tentativas!")
        naoAcertou = false
    }
}
```

---

## 🎮 Dicas para Jogar Melhor

**Estratégia de Busca Binária:**
1. Comece pelo meio (5)
2. Elimine metade das possibilidades a cada tentativa
3. Você consegue acertar em **no máximo 4 tentativas**!

**Exemplo:**
- Tente 5 → Maior? Então é 6, 7, 8, 9 ou 10
- Tente 8 → Menor? Então é 6 ou 7
- Tente 7 → Acertou ou é 6
- Máximo 4 tentativas! 🎯

---

## 🤝 Contribuindo

Ideias são bem-vindas:

- 🐛 Encontrou um bug? Reporte!
- 💡 Tem uma ideia legal? Compartilhe!
- 🎨 Melhorou o código? Faça um PR!
- 📚 Use como base para aprender!

---

## 👨‍💻 Autor

Desenvolvido com 🎲 e ☕ como projeto educacional em Java

---

## 📄 Licença

Este projeto está sob a licença MIT. Livre para uso e modificação.

---

<div align="center">