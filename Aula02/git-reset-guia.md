# 🔄 Git Reset --- Guia Completo

O comando **`git reset`** é usado para **voltar o estado do
repositório** para um commit anterior.\
Dependendo da opção utilizada, ele pode afetar:

-   🧠 **HEAD** (histórico de commits)
-   📦 **Staging Area**
-   💻 **Working Directory** (arquivos no computador)

------------------------------------------------------------------------

## 🧩 Conceitos Básicos

### 💻 Working Directory

Arquivos reais no seu computador, onde você edita o código.

### 📦 Staging Area (Index)

Área intermediária onde ficam os arquivos preparados com `git add`.

### 🗂️ Repository (Commits)

Histórico oficial do projeto, composto pelos commits.

### 🔁 Fluxo do Git

    Working Directory → Staging Area → Commit

------------------------------------------------------------------------

## 🟢 git reset --soft

### 🔧 O que faz

-   Move o **HEAD**
-   ✅ Mantém a Staging Area
-   ✅ Mantém os arquivos no computador

### 📌 Quando usar

-   Corrigir um commit
-   Alterar mensagem de commit
-   Remover um arquivo específico de um commit

### 💡 Exemplo

``` bash
git reset --soft HEAD~1
```

------------------------------------------------------------------------

## 🟡 git reset --mixed (padrão)

### 🔧 O que faz

-   Move o **HEAD**
-   ❌ Limpa a Staging Area
-   ✅ Mantém os arquivos no computador

### 📌 Quando usar

-   Desfazer `git add`
-   Reorganizar arquivos antes do commit

### 💡 Exemplo

``` bash
git reset --mixed HEAD~1
```

ou

``` bash
git reset
```

------------------------------------------------------------------------

## 🔴 git reset --hard

### 🔧 O que faz

-   Move o **HEAD**
-   ❌ Limpa a Staging Area
-   ❌ Apaga os arquivos do computador

### 📌 Quando usar

-   Descartar totalmente alterações locais
-   Voltar o projeto para um estado limpo

⚠️ **Atenção:** alterações não commitadas são perdidas permanentemente.

### 💡 Exemplo

``` bash
git reset --hard HEAD~1
```

------------------------------------------------------------------------

## 📊 Comparação Geral

  Tipo      HEAD   Staging   Arquivos
  --------- ------ --------- ----------
  --soft    ✅     ✅        ✅
  --mixed   ✅     ❌        ✅
  --hard    ✅     ❌        ❌

------------------------------------------------------------------------

## 🧠 Regra de Ouro

-   ✏️ Corrigir commit → **--soft**
-   🧹 Desfazer `git add` → **--mixed**
-   💣 Apagar tudo → **--hard**

------------------------------------------------------------------------

## ✅ Conclusão

O **`git reset`** é poderoso e deve ser usado com cuidado.\
Escolher a opção correta evita perda de dados e mantém o histórico limpo
e organizado 🚀
