function getIniciais(nome) {
    const partes = nome.trim().split(' ');
    if (partes.length >= 2) {
        return partes[0][0].toUpperCase() + partes[partes.length - 1][0].toUpperCase();
    }
    return partes[0][0].toUpperCase();
}

function formatarData(data) {
    const options = { day: '2-digit', month: 'long', year: 'numeric' };
    return new Date(data).toLocaleDateString('pt-BR', options);
}

function exibirPerfil(userData) {
    document.getElementById('avatar-inicial').textContent = getIniciais(userData.nome);
    document.getElementById('perfil-nome').textContent = userData.nome;
    document.getElementById('perfil-email').textContent = userData.email;
    document.getElementById('perfil-telefone').textContent = userData.telefone || 'Não informado';
    document.getElementById('data-cadastro').textContent = formatarData(userData.dataCadastro);
    
    // Atualiza também a navbar
    const navbarName = document.getElementById('navbar-name');
    const navbarAvatar = document.getElementById('navbar-avatar');
    if (navbarName) navbarName.textContent = userData.nome;
    if (navbarAvatar) navbarAvatar.textContent = getIniciais(userData.nome);
}

document.addEventListener('DOMContentLoaded', function() {
    const usuarioAtualEmail = sessionStorage.getItem('usuarioAtual');
    
    if (!usuarioAtualEmail) {
        // Se não houver usuário logado, redireciona para o cadastro
        window.location.href = 'index.html';
        return;
    }
    
    const usuarios = JSON.parse(sessionStorage.getItem('usuarios') || '{}');
    const userData = usuarios[usuarioAtualEmail];
    
    if (userData) {
        exibirPerfil(userData);
    } else {
        // Se não encontrar os dados, redireciona para o cadastro
        window.location.href = 'index.html';
    }
    
    // Botão de editar
    const btnEdit = document.getElementById('btn-edit');
    if (btnEdit) {
        btnEdit.addEventListener('click', function() {
            alert('Não funciona amigo, é um projeto básico');
        });
    }
    
    // Botão de logout
    const btnLogout = document.getElementById('btn-logout');
    const logoutLink = document.getElementById('logout-link');
    
    function fazerLogout() {
        if (confirm('Deseja sair?')) {
            sessionStorage.removeItem('usuarioAtual');
            window.location.href = 'index.html';
        }
    }
    
    if (btnLogout) {
        btnLogout.addEventListener('click', fazerLogout);
    }
    
    if (logoutLink) {
        logoutLink.addEventListener('click', function(e) {
            e.preventDefault();
            fazerLogout();
        });
    }
});
