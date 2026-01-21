<div align="center">

# 🚗 Sistema de Aluguel de Carros

### Locadora Digital Simples e Eficiente

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" alt="Java Logo" width="120"/>

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com/)
[![POO](https://img.shields.io/badge/POO-Oriented-blue?style=for-the-badge)](https://github.com)
[![Rental](https://img.shields.io/badge/System-Car_Rental-red?style=for-the-badge)](https://github.com)
[![Beginner](https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge)](https://github.com)

</div>

---

## 📋 Sobre o Projeto

Sistema **Java console** simples e didático que simula uma **locadora de veículos**. Permite visualizar carros disponíveis, realizar aluguéis com cálculo de diárias e gerenciar devoluções. Perfeito para aprender conceitos de POO aplicados a um cenário real.

> 🚙 **Ideal para:** Iniciantes em Java aprendendo POO, controle de estados e cálculos de negócio

---

## ✨ Funcionalidades

| Funcionalidade | Descrição | Ícone |
|---------------|-----------|-------|
| 🚗 **Visualizar Frota** | Liste todos os carros disponíveis para aluguel | 📋 |
| 🔑 **Alugar Carro** | Realize o aluguel por número de dias | ➕ |
| 📅 **Cálculo de Diárias** | Sistema calcula automaticamente o valor total | 💰 |
| 🔄 **Devolver Carro** | Registre a devolução e libere o veículo | ✅ |

---

## 🚙 Informações dos Carros

Cada veículo possui:

```java
✓ Modelo
✓ Marca
✓ Ano
✓ Valor da diária
✓ Status (Disponível/Alugado)
```

---

## 🎯 Características

- 🎮 **Interface no console** simples e intuitiva
- 💵 **Cálculo automático** de valores de aluguel
- 📊 **Controle de disponibilidade** em tempo real
- 🔒 **Validação de estados** (não aluga carro já alugado)
- 💾 **Dados em memória** (temporários)

---

## 🚀 Como Executar

### Pré-requisitos

- ☕ Java JDK 8 ou superior instalado
- 🖥️ Terminal ou prompt de comando

### Passo a Passo

1️⃣ **Clone ou baixe o projeto**
```bash
git clone [seu-repositorio]
cd Carros
```

2️⃣ **Compile o arquivo principal**
```bash
javac src/Main.java -d out/production/Carros
```

3️⃣ **Execute a aplicação**
```bash
java -cp out/production/Carros Main
```

4️⃣ **Navegue pelo menu** e gerencie os aluguéis! 🚗

---

## 📁 Estrutura do Projeto

```
📦 Carros
 ┣ 📂 .idea
 ┃ ┣ 📜 .gitignore
 ┃ ┣ 📜 misc.xml
 ┃ ┗ 📜 modules.xml
 ┣ 📂 src
 ┃ ┗ 📜 Main.java              # Classe principal do sistema
 ┣ 📂 out
 ┃ ┗ 📂 production
 ┃   ┗ 📂 Carros
 ┃     ┗ 📜 Main.class          # Classe compilada
 ┣ 📜 .gitignore
 ┣ 📜 Carros.iml
 ┗ 📜 README.md                 # Documentação
```

### 🔍 Detalhamento

**`src/Main.java`**
- Ponto de entrada da aplicação
- Menu interativo
- Classe Carro (interna ou separada)
- Lógica de aluguel e devolução
- Cálculo de valores
- Gerenciamento da frota

**Estrutura de Dados**
- Lista de carros disponíveis
- Controle de status de cada veículo
- Cálculos de diárias e valores totais

---

## 💻 Exemplo de Uso

```
=========================================
    SISTEMA DE ALUGUEL DE CARROS
=========================================

--- MENU PRINCIPAL ---
1. 🚗 Ver carros disponíveis
2. 🔑 Alugar carro
3. 🔄 Devolver carro
0. 🚪 Sair

Escolha uma opção: 1

--- CARROS DISPONÍVEIS ---

🚗 Carro #1
   Modelo: Civic
   Marca: Honda
   Ano: 2023
   Diária: R$ 150,00
   Status: ✅ Disponível

🚗 Carro #2
   Modelo: Onix
   Marca: Chevrolet
   Ano: 2022
   Diária: R$ 100,00
   Status: ✅ Disponível

🚗 Carro #3
   Modelo: HB20
   Marca: Hyundai
   Ano: 2023
   Diária: R$ 120,00
   Status: 🔒 Alugado

Total de carros: 3
Disponíveis: 2

=========================================

Escolha uma opção: 2

--- ALUGAR CARRO ---

Carros disponíveis:
1. Honda Civic - R$ 150,00/dia
2. Chevrolet Onix - R$ 100,00/dia

Digite o número do carro: 1
Quantos dias de aluguel? 5

📋 Resumo do Aluguel:
   Carro: Honda Civic
   Diárias: 5 dias
   Valor/dia: R$ 150,00
   Total: R$ 750,00

Confirma o aluguel? (S/N): S

✅ Aluguel realizado com sucesso!
🔑 Aproveite seu Honda Civic!

=========================================

Escolha uma opção: 3

--- DEVOLVER CARRO ---

Carros alugados:
1. Honda Civic

Digite o número do carro: 1

✅ Carro Honda Civic devolvido com sucesso!
Obrigado por utilizar nossos serviços! 🚗

=========================================
```

---

## 🎓 Conceitos de POO Aplicados

```java
✓ Classes e Objetos
✓ Encapsulamento
✓ Construtores
✓ Getters e Setters
✓ Métodos de Negócio
✓ ArrayList (Collections)
✓ Controle de Estados
✓ Cálculos com Valores
✓ Validação de Operações
```

---

## 💰 Cálculos Implementados

O sistema realiza:

- 💵 **Cálculo de aluguel**: `Valor Total = Diária × Número de Dias`
- 📊 **Validação de disponibilidade** antes do aluguel
- 🔄 **Atualização de status** automática
- ✅ **Liberação do veículo** após devolução

---

## 🛠️ Tecnologias

<div align="center">

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Collections](https://img.shields.io/badge/Collections-ArrayList-blue?style=for-the-badge)

</div>

---

## 💡 Aprendizados

Este projeto ensina na prática:

- 🚗 Modelagem de entidades do mundo real
- 🔒 Controle de estados de objetos
- 💰 Implementação de regras de negócio
- ✔️ Validações contextuais
- 📊 Cálculos comerciais
- 🎮 Interação via menu console
- 🏗️ Estruturação de projetos em Java

---

## ⚠️ Limitações (Propositais para Aprendizado)

- 💾 Dados **não persistem** (armazenamento em memória)
- 👤 Sem cadastro de clientes
- 📅 Não registra datas de aluguel/devolução
- 🔐 Sem autenticação ou controle de usuários
- 📊 Sem histórico de aluguéis

> **Nota:** Estas limitações mantêm o foco nos conceitos fundamentais de POO e controle de estados.

---

## 📝 Próximos Passos e Melhorias

### Nível Intermediário
- [ ] Adicionar cadastro de clientes
- [ ] Implementar controle de datas (LocalDate)
- [ ] Calcular multas por atraso
- [ ] Adicionar diferentes categorias de veículos
- [ ] Implementar sistema de reservas
- [ ] Persistência em arquivos

### Nível Avançado
- [ ] Migrar para banco de dados
- [ ] Sistema de pagamentos
- [ ] Histórico completo de aluguéis
- [ ] Relatórios de faturamento
- [ ] Interface gráfica (JavaFX)
- [ ] Sistema de descontos e promoções
- [ ] Controle de manutenção dos veículos
- [ ] API REST para integração

---

## 🎯 Regras de Negócio

O sistema implementa as seguintes regras:

✅ Carro só pode ser alugado se estiver **disponível**
✅ Aluguel requer **número de dias válido** (> 0)
✅ **Cálculo automático** do valor total
✅ Devolução só é permitida para carros **efetivamente alugados**
✅ Status atualizado automaticamente após cada operação

---

## 🔧 Casos de Teste Importantes

Teste os seguintes cenários:

- ✅ Tentar alugar um carro já alugado
- ✅ Tentar devolver um carro não alugado
- ✅ Alugar por 0 ou número negativo de dias
- ✅ Verificar cálculo correto dos valores
- ✅ Múltiplos aluguéis e devoluções consecutivos

---

## 🤝 Contribuindo

Sinta-se à vontade para:

- 🐛 Reportar bugs
- 💡 Sugerir novas funcionalidades
- 🔧 Fazer fork e melhorar o código
- 📚 Usar como base para projetos maiores

---

## 👨‍💻 Autor

Desenvolvido com 🚗 e ☕ como projeto educacional em Java

---

## 📄 Licença

Este projeto está sob a licença MIT. Livre para uso educacional e comercial.

---


