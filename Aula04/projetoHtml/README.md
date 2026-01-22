<div align="center">

# 🌐 Sistema Web Deloitte - Portal Corporativo

### Portal Web Moderno com Autenticação e Gerenciamento de Perfil

<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" alt="HTML5 Logo" width="80"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-original.svg" alt="CSS3 Logo" width="80"/>
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/javascript/javascript-original.svg" alt="JavaScript Logo" width="80"/>

[![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
[![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)](https://developer.mozilla.org/pt-BR/docs/Web/CSS)
[![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)](https://developer.mozilla.org/pt-BR/docs/Web/JavaScript)
[![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=for-the-badge&logo=bootstrap&logoColor=white)](https://getbootstrap.com/)

</div>

---

## 📋 Sobre o Projeto

Sistema **web completo** desenvolvido para simular um portal corporativo da **Deloitte**. Uma aplicação moderna e responsiva que permite cadastro de usuários, autenticação via sessão, página inicial com notícias e gerenciamento de perfil. Desenvolvido com tecnologias web modernas e design profissional.

> 🎯 **Ideal para:** Estudantes aprendendo desenvolvimento web front-end, manipulação de DOM, localStorage/sessionStorage e design responsivo

---

## ✨ Funcionalidades

### 🔐 Autenticação e Cadastro

| Funcionalidade | Descrição | Ícone |
|---------------|-----------|-------|
| 📝 **Cadastro de Usuário** | Registro completo com validações | ➕ |
| 🔑 **Login Automático** | Autenticação via sessionStorage | 🔐 |
| 👤 **Gerenciamento de Sessão** | Controle de usuário logado | 🎫 |
| 🚪 **Logout** | Encerramento seguro de sessão | 🚪 |

### 🏠 Página Inicial

| Funcionalidade | Descrição | Ícone |
|---------------|-----------|-------|
| 📰 **Notícias Corporativas** | Cards informativos sobre a empresa | 📰 |
| 🎨 **Design Moderno** | Interface profissional com tema Deloitte | 🎨 |
| 📱 **Responsivo** | Adaptável a diferentes tamanhos de tela | 📱 |
| 🌍 **Tema Global** | Participação em eventos como WEF Davos | 🌍 |

### 👤 Perfil do Usuário

| Funcionalidade | Descrição | Ícone |
|---------------|-----------|-------|
| 📊 **Visualização de Dados** | Exibição completa das informações cadastradas | 📊 |
| 🎭 **Avatar com Iniciais** | Geração automática de avatar | 🎭 |
| 📅 **Data de Cadastro** | Histórico formatado em português | 📅 |
| ✏️ **Edição (Futuro)** | Preparado para funcionalidade de edição | ✏️ |

---

## 🎨 Design e Tema

### Paleta de Cores

O projeto utiliza a identidade visual da Deloitte:

```css
✓ Preto (#000000) - Fundo principal
✓ Verde (#86BC25) - Cor de destaque e acentos
✓ Gradientes modernos
✓ Sombras e efeitos visuais
```

### Características Visuais

- 🎨 **Design Dark Mode** - Interface escura profissional
- ✨ **Animações Suaves** - Transições e efeitos hover
- 🖼️ **Logo Oficial** - Logo da Deloitte integrado
- 📐 **Layout Responsivo** - Bootstrap 5.3.2
- 🎯 **UX Moderna** - Experiência de usuário aprimorada

---

## 🚀 Como Executar

### Pré-requisitos

- 🌐 Navegador web moderno (Chrome, Firefox, Edge, Safari)
- 📁 Servidor web local (opcional, mas recomendado)

### Opção 1: Abrir Diretamente

1️⃣ **Navegue até a pasta do projeto**
```bash
cd Aula04/projetoHtml
```

2️⃣ **Abra o arquivo `index.html` no navegador**
- Clique duplo no arquivo, ou
- Arraste para o navegador, ou
- Use: `file:///caminho/para/index.html`

### Opção 2: Servidor Local (Recomendado)

#### Com Python:
```bash
# Python 3
python -m http.server 8000

# Python 2
python -m SimpleHTTPServer 8000
```

#### Com Node.js (http-server):
```bash
npx http-server -p 8000
```

#### Com VS Code:
- Instale a extensão "Live Server"
- Clique com botão direito em `index.html`
- Selecione "Open with Live Server"

3️⃣ **Acesse no navegador**
```
http://localhost:8000
```

---

## 📁 Estrutura do Projeto

```
📦 projetoHtml
 ┣ 📂 scripts
 ┃ ┣ 📜 cadastro.js      # Lógica de cadastro e validação
 ┃ ┣ 📜 home.js          # Gerenciamento da página inicial
 ┃ ┗ 📜 perfil.js        # Exibição e controle do perfil
 ┣ 📂 style
 ┃ ┣ 📜 common.css       # Estilos compartilhados (navbar, variáveis)
 ┃ ┣ 📜 cadastro.css     # Estilos da página de cadastro
 ┃ ┣ 📜 home.css         # Estilos da página inicial
 ┃ ┣ 📜 perfil.css       # Estilos da página de perfil
 ┃ ┗ 📜 styles.css       # Estilos legados (mantido para compatibilidade)
 ┣ 📜 index.html         # Página de cadastro/login
 ┣ 📜 home.html          # Página inicial (após login)
 ┣ 📜 perfil.html        # Página de perfil do usuário
 ┣ 📜 package.json       # Dependências do projeto
 ┗ 📜 README.md          # Documentação
```

### 🔍 Detalhamento dos Arquivos

**`index.html`**
- Página de cadastro de novos usuários
- Formulário com validações
- Design temático Deloitte
- Redirecionamento após cadastro

**`home.html`**
- Página inicial após login
- Seção hero com imagem de fundo
- Cards de notícias corporativas
- Navbar com menu de usuário
- Footer informativo

**`perfil.html`**
- Visualização completa do perfil
- Informações do usuário formatadas
- Avatar com iniciais
- Botões de ação (editar/logout)

**`scripts/cadastro.js`**
- Validação de formulário
- Formatação de telefone
- Armazenamento em sessionStorage
- Redirecionamento após cadastro

**`scripts/home.js`**
- Verificação de autenticação
- Carregamento de dados do usuário
- Funcionalidade de logout
- Atualização da navbar

**`scripts/perfil.js`**
- Geração de iniciais para avatar
- Formatação de datas
- Exibição de dados do perfil
- Controle de logout

**`style/common.css`**
- Variáveis CSS do tema
- Estilos da navbar
- Estilos globais compartilhados

**`style/cadastro.css`**
- Estilos específicos do formulário
- Design temático Deloitte
- Animações e transições

**`style/home.css`**
- Estilos da página inicial
- Cards de notícias
- Hero section
- Footer

**`style/perfil.css`**
- Estilos da página de perfil
- Cards de informação
- Botões de ação

---

## 💻 Exemplo de Uso

### Fluxo Completo

```
1. Usuário acessa index.html
   ↓
2. Preenche formulário de cadastro
   - Nome completo
   - E-mail
   - Telefone (opcional)
   - Senha
   - Confirmação de senha
   ↓
3. Sistema valida os dados
   - Nome mínimo 3 caracteres
   - E-mail válido
   - Senha mínimo 6 caracteres
   - Senhas coincidem
   - Termos aceitos
   ↓
4. Dados salvos em sessionStorage
   ↓
5. Redirecionamento para home.html
   ↓
6. Página inicial exibe:
   - Mensagem personalizada
   - Notícias corporativas
   - Navbar com nome do usuário
   ↓
7. Usuário pode acessar perfil.html
   - Visualizar informações
   - Fazer logout
```

### Exemplo de Dados Armazenados

```javascript
sessionStorage.setItem('usuarioAtual', 'usuario@email.com');
sessionStorage.setItem('usuarios', JSON.stringify({
  'usuario@email.com': {
    nome: 'João Silva',
    email: 'usuario@email.com',
    telefone: '(11) 98765-4321',
    dataCadastro: '2024-01-15T10:30:00.000Z'
  }
}));
```

---

## 🎓 Conceitos Aplicados

### HTML5
```html
✓ Estrutura semântica
✓ Formulários com validação nativa
✓ Meta tags responsivas
✓ Acessibilidade básica
```

### CSS3
```css
✓ Variáveis CSS (Custom Properties)
✓ Flexbox e Grid Layout
✓ Gradientes e sombras
✓ Animações e transições
✓ Media queries (responsividade)
✓ Pseudo-elementos (::before, ::after)
```

### JavaScript (ES6+)
```javascript
✓ Manipulação do DOM
✓ Event Listeners
✓ sessionStorage API
✓ JSON (parse/stringify)
✓ Arrow Functions
✓ Template Literals
✓ Validação de formulários
✓ Formatação de dados
```

### Bootstrap 5
```html
✓ Sistema de grid responsivo
✓ Componentes (navbar, cards, buttons)
✓ Ícones (Bootstrap Icons)
✓ Utilities classes
```

---

## 🛠️ Tecnologias

<div align="center">

![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Bootstrap](https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white)

</div>

### Bibliotecas e Frameworks

- **Bootstrap 5.3.2** - Framework CSS responsivo
- **Bootstrap Icons 1.11.1** - Biblioteca de ícones
- **Google Fonts** - Tipografia (via sistema)

---

## 💡 Aprendizados

Este projeto proporciona experiência prática em:

- 🌐 **Desenvolvimento Web Front-end** completo
- 🎨 **Design de Interfaces** modernas e profissionais
- 📱 **Responsividade** e adaptação a diferentes dispositivos
- 💾 **Armazenamento Local** (sessionStorage)
- 🔐 **Autenticação Básica** via JavaScript
- 🎯 **Validação de Formulários** client-side
- 🧩 **Organização de Código** (HTML, CSS, JS separados)
- 🎭 **Manipulação de DOM** dinâmica
- 🎨 **CSS Moderno** (variáveis, gradientes, animações)
- 🏗️ **Estruturação de Projetos Web**

---

## ⚠️ Limitações (Propositais para Aprendizado)

- 💾 Dados armazenados apenas em **sessionStorage** (perdidos ao fechar navegador)
- 🔐 **Sem criptografia** de senhas (apenas armazenamento básico)
- 🌐 **Sem backend** (tudo client-side)
- 📊 **Sem banco de dados** (armazenamento local apenas)
- 🔄 **Sem persistência** entre sessões diferentes
- 🚫 **Sem validação server-side**

> **Nota:** Estas limitações mantêm o foco nos conceitos fundamentais de desenvolvimento web front-end.

---

## 📝 Possíveis Melhorias Futuras

### Funcionalidades
- [ ] Sistema de login separado (não apenas cadastro)
- [ ] Edição de perfil funcional
- [ ] Upload de foto de perfil
- [ ] Recuperação de senha
- [ ] Histórico de atividades
- [ ] Notificações
- [ ] Busca de notícias
- [ ] Filtros e categorias

### Técnicas
- [ ] Migrar para framework (React, Vue, Angular)
- [ ] Implementar backend (Node.js, Python, Java)
- [ ] Integrar banco de dados (MySQL, PostgreSQL, MongoDB)
- [ ] Adicionar testes (Jest, Cypress)
- [ ] Implementar PWA (Progressive Web App)
- [ ] Adicionar Service Workers
- [ ] Implementar autenticação JWT
- [ ] Adicionar criptografia de senhas (BCrypt)

### Design
- [ ] Modo claro/escuro alternável
- [ ] Mais animações e micro-interações
- [ ] Temas personalizáveis
- [ ] Internacionalização (i18n)
- [ ] Acessibilidade aprimorada (ARIA)

### Segurança
- [ ] Validação server-side
- [ ] Proteção CSRF
- [ ] Sanitização de inputs
- [ ] Rate limiting
- [ ] Criptografia de dados sensíveis

---

## 🎯 Regras de Negócio

O sistema implementa as seguintes regras:

✅ **Cadastro**
- Nome deve ter no mínimo 3 caracteres
- E-mail deve conter "@" e ser válido
- Senha deve ter no mínimo 6 caracteres
- Senhas devem coincidir
- Termos de uso devem ser aceitos

✅ **Autenticação**
- Usuário deve estar cadastrado para acessar páginas protegidas
- Redirecionamento automático se não autenticado
- Sessão mantida durante navegação

✅ **Perfil**
- Dados exibidos apenas para usuário logado
- Avatar gerado automaticamente das iniciais
- Data formatada em português brasileiro

---

## 🔧 Casos de Teste Importantes

Teste os seguintes cenários:

- ✅ Cadastro com dados válidos
- ✅ Tentativa de cadastro com senhas diferentes
- ✅ Cadastro com e-mail inválido
- ✅ Acesso a home.html sem estar logado (redirecionamento)
- ✅ Acesso a perfil.html sem estar logado (redirecionamento)
- ✅ Logout e verificação de redirecionamento
- ✅ Formatação automática de telefone
- ✅ Geração correta de iniciais do avatar
- ✅ Responsividade em diferentes tamanhos de tela

---

## 📱 Responsividade

O projeto é totalmente responsivo:

- 📱 **Mobile** (< 576px) - Layout adaptado para smartphones
- 📱 **Tablet** (576px - 992px) - Layout intermediário
- 💻 **Desktop** (> 992px) - Layout completo

**Breakpoints Bootstrap:**
- `sm`: 576px
- `md`: 768px
- `lg`: 992px
- `xl`: 1200px
- `xxl`: 1400px

---

## 🎨 Personalização do Tema

As cores e estilos podem ser facilmente alteradas através das variáveis CSS em `style/common.css`:

```css
:root {
    --primary-green: #86BC25;    /* Cor principal */
    --dark-green: #6a951d;       /* Verde escuro */
    --black: #000000;             /* Preto */
    --dark-black: #0a0a0a;       /* Preto escuro */
}
```

---

## 🤝 Contribuindo

Sinta-se à vontade para:

- 🐛 Reportar bugs
- 💡 Sugerir novas funcionalidades
- 🔧 Fazer fork e melhorar o código
- 📚 Usar como base para projetos maiores
- 🎨 Melhorar o design e UX

---

## 👨‍💻 Autor

Desenvolvido como projeto educacional no Bootcamp Java da Deloitte.

---

## 📄 Licença

Este projeto está sob a licença MIT. Livre para uso educacional e comercial.

---

<div align="center">

[⬆ Voltar ao topo](#-sistema-web-deloitte---portal-corporativo)

</div>

