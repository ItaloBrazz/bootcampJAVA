function getIniciais(nome) {
    const partes = nome.trim().split(' ');
    if (partes.length >= 2) {
        return partes[0][0].toUpperCase() + partes[partes.length - 1][0].toUpperCase();
    }
    return partes[0][0].toUpperCase();
}

function carregarDadosUsuario() {
    const usuarioAtualEmail = sessionStorage.getItem('usuarioAtual');
    
    if (!usuarioAtualEmail) {
        // Se não houver usuário logado, redireciona para o cadastro
        window.location.href = 'index.html';
        return;
    }
    
    const usuarios = JSON.parse(sessionStorage.getItem('usuarios') || '{}');
    const userData = usuarios[usuarioAtualEmail];
    
    if (userData) {
        // Atualiza o nome na navbar
        const navbarName = document.getElementById('navbar-name');
        const navbarAvatar = document.getElementById('navbar-avatar');
        const welcomeName = document.getElementById('welcome-name');
        
        if (navbarName) navbarName.textContent = userData.nome;
        if (navbarAvatar) navbarAvatar.textContent = getIniciais(userData.nome);
        if (welcomeName) welcomeName.textContent = userData.nome;
    } else {
        // Se não encontrar os dados, redireciona para o cadastro
        window.location.href = 'index.html';
    }
}

// Logout
document.addEventListener('DOMContentLoaded', function() {
    carregarDadosUsuario();
    
    const logoutLink = document.getElementById('logout-link');
    if (logoutLink) {
        logoutLink.addEventListener('click', function(e) {
            e.preventDefault();
            if (confirm('Deseja sair?')) {
                sessionStorage.removeItem('usuarioAtual');
                window.location.href = 'index.html';
            }
        });
    }
});

