const form = document.getElementById('cadastro-form');

function showMessage(text, type) {
    const oldMessage = document.querySelector('.message');
    if (oldMessage) {
        oldMessage.remove();
    }
    
    const message = document.createElement('div');
    message.className = `message ${type}`;
    message.textContent = text;
    message.style.display = 'block';
    
    form.parentNode.insertBefore(message, form);
    
    setTimeout(() => {
        message.remove();
    }, 3000);
}

form.addEventListener('submit', function(e) {
    e.preventDefault();
    
    const nome = document.getElementById('nome').value.trim();
    const email = document.getElementById('email').value.trim();
    const telefone = document.getElementById('telefone').value.trim();
    const senha = document.getElementById('senha').value;
    const confirmarSenha = document.getElementById('confirmar-senha').value;
    const termos = document.getElementById('termos').checked;
    
    if (nome.length < 3) {
        showMessage('Nome deve ter pelo menos 3 caracteres', 'error');
        return;
    }
    
    if (!email.includes('@')) {
        showMessage('E-mail inválido', 'error');
        return;
    }
    
    if (senha.length < 6) {
        showMessage('Senha deve ter pelo menos 6 caracteres', 'error');
        return;
    }
    
    if (senha !== confirmarSenha) {
        showMessage('As senhas não coincidem', 'error');
        return;
    }
    
    if (!termos) {
        showMessage('Aceite os termos para continuar', 'error');
        return;
    }
    
    const button = form.querySelector('.btn-submit');
    const originalText = button.textContent;
    
    button.textContent = 'Cadastrando...';
    button.disabled = true;
    
    setTimeout(() => {
        const userData = {
            nome,
            email,
            telefone,
            dataCadastro: new Date().toISOString()
        };
        
        // Salva os dados do usuário
        const usuarios = JSON.parse(sessionStorage.getItem('usuarios') || '{}');
        usuarios[email] = userData;
        sessionStorage.setItem('usuarios', JSON.stringify(usuarios));
        sessionStorage.setItem('usuarioAtual', email);
        
        button.textContent = originalText;
        button.disabled = false;
        
        // Redireciona para a página inicial
        window.location.href = 'home.html';
    }, 800);
});

const telefoneInput = document.getElementById('telefone');
telefoneInput.addEventListener('input', function(e) {
    let value = e.target.value.replace(/\D/g, '');
    
    if (value.length <= 11) {
        value = value.replace(/^(\d{2})(\d)/g, '($1) $2');
        value = value.replace(/(\d)(\d{4})$/, '$1-$2');
    }
    
    e.target.value = value;
});