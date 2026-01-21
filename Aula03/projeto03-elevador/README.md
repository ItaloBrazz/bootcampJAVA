<div align="center">

# 🏢 Simulador de Elevador

### Sistema Interativo de Controle de Elevadores

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![Simulation](https://img.shields.io/badge/Simulation-Elevator-orange?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Simulador **Java console** que reproduz o funcionamento real de um elevador em um edifício. O projeto aplica **Programação Orientada a Objetos** para gerenciar estados, validações e regras de negócio específicas de sistemas de transporte vertical.

> 🏢 **Ideal para:** Estudantes de Java aprendendo POO com casos de uso reais, simulação de sistemas físicos e validação de regras de negócio

---

## ✨ Funcionalidades

| Funcionalidade | Descrição |
|---------------|-----------|
| ⚙️ **Configuração Inicial** | Defina capacidade máxima e total de andares |
| 👥 **Entrada de Pessoas** | Adicione passageiros respeitando o limite |
| 🚶 **Saída de Pessoas** | Remova passageiros do elevador |
| ⬆️ **Subir Andares** | Movimente o elevador para cima |
| ⬇️ **Descer Andares** | Movimente o elevador para baixo |
| 📊 **Status em Tempo Real** | Visualize estado completo do elevador |
| ⚖️ **Cálculo de Peso** | Monitore carga atual vs. capacidade máxima |

---

## 🎯 Especificações Técnicas

### Parâmetros Configuráveis

```java
✓ Capacidade Máxima de Pessoas
✓ Total de Andares do Prédio
✓ Andar Inicial (Térreo = 0)
```

### Constantes do Sistema

| Parâmetro | Valor | Descrição |
|-----------|-------|-----------|
| 🧍 **Peso Médio por Pessoa** | 80 kg | Usado para cálculos de carga |
| 🏢 **Andar Térreo** | 0 | Andar inicial padrão |

---

## 🔄 Regras de Operação

### Capacidade e Segurança
- ✅ Respeita limite máximo de pessoas
- ✅ Calcula peso total baseado em 80kg por pessoa
- ✅ Impede entrada de pessoas acima da capacidade
- ✅ Valida saída de pessoas (não pode ter saldo negativo)

### Movimentação
- ⬆️ Sobe apenas **um andar por vez**
- ⬇️ Desce apenas **um andar por vez**
- 🛑 Não pode subir além do último andar
- 🛑 Não pode descer além do térreo (andar 0)

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd simulador-elevador
```

2️⃣ **Compile os arquivos**
```bash
javac src/**/*.java
```

3️⃣ **Execute a aplicação**
```bash
java -cp src Main4
```

4️⃣ **Configure o elevador** e comece a simulação! 🏢

---

## 📁 Estrutura do Projeto

```
📦 simulador-elevador
 ┣ 📂 src
 ┃ ┣ 📂 model
 ┃ ┃ ┗ 📜 Elevador.java           # Modelo da entidade Elevador
 ┃ ┣ 📂 service
 ┃ ┃ ┗ 📜 ElevadorService.java    # Lógica de negócio e validações
 ┃ ┗ 📜 Main4.java                 # Classe principal
 ┗ 📜 README.md                    # Documentação
```

### 🔍 Detalhamento das Classes

**`model/Elevador.java`**
- Define os atributos do elevador
- Andar atual, capacidade, pessoas a bordo
- Getters e Setters
- Cálculo de peso total

**`service/ElevadorService.java`**
- Validações de capacidade e movimento
- Lógica de entrada/saída de pessoas
- Controle de subida/descida de andares
- Regras de segurança do sistema
- Exibição de status

**`Main4.java`**
- Ponto de entrada da aplicação
- Menu interativo
- Inicialização e configuração
- Interface com o usuário

---

## 💻 Exemplo de Uso

```
=========================================
      SIMULADOR DE ELEVADOR
=========================================

--- CONFIGURAÇÃO INICIAL ---
Capacidade máxima de pessoas: 8
Total de andares do prédio: 15

✅ Elevador configurado com sucesso!

--- MENU DE OPERAÇÕES ---
1. Entrar pessoas
2. Sair pessoas
3. Subir andar
4. Descer andar
5. Exibir status
0. Sair

Escolha uma opção: 1

Quantas pessoas vão entrar? 5
✅ 5 pessoa(s) entraram no elevador.

=========================================

Escolha uma opção: 3

⬆️ Subindo para o andar 1...
✅ Elevador agora está no andar 1.

=========================================

Escolha uma opção: 5

--- STATUS DO ELEVADOR ---
📍 Andar atual: 1
👥 Pessoas a bordo: 5
📊 Capacidade: 5/8 pessoas
⚖️ Peso atual: 400 kg
📏 Peso máximo: 640 kg
🔋 Status: Operacional

=========================================

Escolha uma opção: 3

⬆️ Subindo para o andar 2...
✅ Elevador agora está no andar 2.

=========================================
```

---

## 🎓 Conceitos de POO Aplicados

```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Métodos Getters e Setters
✓ Validação de Estados
✓ Máquina de Estados (Andares)
✓ Regras de Negócio Complexas
✓ Separação de Responsabilidades
✓ Imutabilidade de Constantes
✓ Tratamento de Limites e Fronteiras
```

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

</div>

---

## 📝 Possíveis Melhorias Futuras

- [ ] Implementar múltiplos elevadores no prédio
- [ ] Adicionar fila de chamadas por andar
- [ ] Sistema inteligente de priorização de andares
- [ ] Simular tempo de movimento entre andares
- [ ] Adicionar manutenção e status de emergência
- [ ] Criar interface gráfica animada
- [ ] Implementar diferentes velocidades de elevador
- [ ] Adicionar histórico de viagens
- [ ] Sistema de peso real com sensor
- [ ] Modo de economia de energia (horário de baixo uso)

---

## 🎯 Aprendizados

Este projeto proporciona experiência prática em:

- 🧱 Modelagem de sistemas físicos
- 🔒 Validação de estados e transições
- ✔️ Regras de negócio complexas
- 🎮 Máquinas de estado finito
- 📊 Cálculos de limites e capacidade
- 🚨 Tratamento de casos de borda
- 🏗️ Separação clara de responsabilidades
- 💡 Simulação de sistemas do mundo real

---

## 🔧 Casos de Teste Importantes

O sistema deve lidar corretamente com:

- ✅ Tentativa de entrar mais pessoas que a capacidade
- ✅ Tentativa de sair mais pessoas que estão no elevador
- ✅ Tentativa de subir além do último andar
- ✅ Tentativa de descer abaixo do térreo
- ✅ Cálculo correto de peso total
- ✅ Múltiplas operações consecutivas

---

## 👨‍💻 Autor

Desenvolvido por Ítalo Braz como projeto de estudos em Java no Bootcamp da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e distribuir.

---