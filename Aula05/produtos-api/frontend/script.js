// Configuração da API
const API_BASE_URL = 'http://localhost:8085/produtos';

// Estado da aplicação
let modoEdicao = false;
let produtoEditando = null;

// Inicialização
document.addEventListener('DOMContentLoaded', function() {
    carregarProdutos();
    configurarFormulario();
});

// Configurar formulário
function configurarFormulario() {
    const form = document.getElementById('produto-form');
    form.addEventListener('submit', function(e) {
        e.preventDefault();
        if (modoEdicao) {
            atualizarProduto();
        } else {
            cadastrarProduto();
        }
    });
}

// Carregar todos os produtos
async function carregarProdutos() {
    const loading = document.getElementById('loading');
    const container = document.getElementById('produtos-container');
    const emptyState = document.getElementById('empty-state');
    
    loading.style.display = 'block';
    container.innerHTML = '';
    emptyState.style.display = 'none';

    try {
        const response = await fetch(API_BASE_URL);
        
        if (!response.ok) {
            throw new Error('Erro ao carregar produtos');
        }

        const produtos = await response.json();
        
        loading.style.display = 'none';
        
        if (produtos.length === 0) {
            emptyState.style.display = 'block';
            document.getElementById('total-produtos').textContent = '0 produtos';
        } else {
            document.getElementById('total-produtos').textContent = `${produtos.length} produto(s)`;
            produtos.forEach(produto => {
                container.appendChild(criarCardProduto(produto));
            });
        }
    } catch (error) {
        loading.style.display = 'none';
        mostrarAlerta('Erro ao carregar produtos. Verifique se a API está rodando em http://localhost:8085', 'danger');
        console.error('Erro:', error);
    }
}

// Criar card de produto
function criarCardProduto(produto) {
    const div = document.createElement('div');
    div.className = 'produto-item';
    div.id = `produto-${produto.id}`;
    
    const precoFormatado = formatarPreco(produto.preco);
    
    div.innerHTML = `
        <div class="produto-header">
            <div class="produto-info">
                <h5>
                    <i class="bi bi-box-seam me-2"></i>
                    ${escapeHtml(produto.nome)}
                </h5>
                <p class="produto-id">ID: ${produto.id}</p>
            </div>
        </div>
        <div class="produto-preco">
            <i class="bi bi-currency-dollar me-1"></i>
            ${precoFormatado}
        </div>
        <div class="produto-acoes">
            <button class="btn btn-warning btn-sm" onclick="editarProduto(${produto.id})">
                <i class="bi bi-pencil me-1"></i>Editar
            </button>
            <button class="btn btn-danger btn-sm" onclick="deletarProduto(${produto.id}, '${escapeHtml(produto.nome)}')">
                <i class="bi bi-trash me-1"></i>Excluir
            </button>
        </div>
    `;
    
    return div;
}

// Cadastrar novo produto
async function cadastrarProduto() {
    const nome = document.getElementById('produto-nome').value.trim();
    const preco = parseFloat(document.getElementById('produto-preco').value);

    if (!nome || !preco || preco < 0) {
        mostrarAlerta('Por favor, preencha todos os campos corretamente.', 'danger');
        return;
    }

    const produto = {
        nome: nome,
        preco: preco
    };

    try {
        const response = await fetch(API_BASE_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(produto)
        });

        if (!response.ok) {
            throw new Error('Erro ao cadastrar produto');
        }

        const produtoSalvo = await response.json();
        mostrarAlerta(`Produto "${produtoSalvo.nome}" cadastrado com sucesso!`, 'success');
        limparFormulario();
        carregarProdutos();
    } catch (error) {
        mostrarAlerta('Erro ao cadastrar produto. Verifique se a API está rodando.', 'danger');
        console.error('Erro:', error);
    }
}

// Editar produto
async function editarProduto(id) {
    try {
        const response = await fetch(`${API_BASE_URL}/${id}`);
        
        if (!response.ok) {
            throw new Error('Erro ao buscar produto');
        }

        const produto = await response.json();
        
        // Preencher formulário
        document.getElementById('produto-id').value = produto.id;
        document.getElementById('produto-nome').value = produto.nome;
        document.getElementById('produto-preco').value = produto.preco;
        
        // Mudar para modo edição
        modoEdicao = true;
        produtoEditando = produto;
        document.getElementById('form-title').textContent = 'Editar Produto';
        document.getElementById('btn-submit-text').textContent = 'Atualizar';
        
        // Mostrar formulário e rolar até ele
        document.getElementById('form-card').style.display = 'block';
        document.getElementById('form-card').scrollIntoView({ behavior: 'smooth' });
        
    } catch (error) {
        mostrarAlerta('Erro ao carregar produto para edição.', 'danger');
        console.error('Erro:', error);
    }
}

// Atualizar produto
async function atualizarProduto() {
    const id = document.getElementById('produto-id').value;
    const nome = document.getElementById('produto-nome').value.trim();
    const preco = parseFloat(document.getElementById('produto-preco').value);

    if (!nome || !preco || preco < 0) {
        mostrarAlerta('Por favor, preencha todos os campos corretamente.', 'danger');
        return;
    }

    const produto = {
        nome: nome,
        preco: preco
    };

    try {
        const response = await fetch(`${API_BASE_URL}/${id}`, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(produto)
        });

        if (!response.ok) {
            if (response.status === 404) {
                throw new Error('Produto não encontrado');
            }
            throw new Error('Erro ao atualizar produto');
        }

        const produtoAtualizado = await response.json();
        mostrarAlerta(`Produto "${produtoAtualizado.nome}" atualizado com sucesso!`, 'success');
        limparFormulario();
        carregarProdutos();
    } catch (error) {
        mostrarAlerta('Erro ao atualizar produto. Verifique se a API está rodando.', 'danger');
        console.error('Erro:', error);
    }
}

// Deletar produto
async function deletarProduto(id, nome) {
    if (!confirm(`Tem certeza que deseja excluir o produto "${nome}"?`)) {
        return;
    }

    try {
        const response = await fetch(`${API_BASE_URL}/${id}`, {
            method: 'DELETE'
        });

        if (!response.ok) {
            if (response.status === 404) {
                throw new Error('Produto não encontrado');
            }
            throw new Error('Erro ao deletar produto');
        }

        mostrarAlerta(`Produto "${nome}" excluído com sucesso!`, 'success');
        carregarProdutos();
    } catch (error) {
        mostrarAlerta('Erro ao excluir produto. Verifique se a API está rodando.', 'danger');
        console.error('Erro:', error);
    }
}

// Mostrar formulário
function mostrarFormulario() {
    limparFormulario();
    document.getElementById('form-card').style.display = 'block';
    document.getElementById('form-card').scrollIntoView({ behavior: 'smooth' });
    document.getElementById('produto-nome').focus();
}

// Cancelar edição
function cancelarEdicao() {
    limparFormulario();
    document.getElementById('form-card').style.display = 'none';
}

// Limpar formulário
function limparFormulario() {
    document.getElementById('produto-form').reset();
    document.getElementById('produto-id').value = '';
    modoEdicao = false;
    produtoEditando = null;
    document.getElementById('form-title').textContent = 'Cadastrar Novo Produto';
    document.getElementById('btn-submit-text').textContent = 'Cadastrar';
}

// Mostrar alerta
function mostrarAlerta(mensagem, tipo = 'info') {
    const container = document.getElementById('alert-container');
    const alertId = 'alert-' + Date.now();
    
    const alert = document.createElement('div');
    alert.id = alertId;
    alert.className = `alert alert-${tipo} alert-dismissible fade show`;
    alert.innerHTML = `
        <i class="bi bi-${tipo === 'success' ? 'check-circle' : tipo === 'danger' ? 'exclamation-triangle' : 'info-circle'} me-2"></i>
        ${escapeHtml(mensagem)}
        <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
    `;
    
    container.innerHTML = '';
    container.appendChild(alert);
    
    // Auto-remover após 5 segundos
    setTimeout(() => {
        const alertElement = document.getElementById(alertId);
        if (alertElement) {
            const bsAlert = new bootstrap.Alert(alertElement);
            bsAlert.close();
        }
    }, 5000);
}

// Formatar preço
function formatarPreco(preco) {
    return new Intl.NumberFormat('pt-BR', {
        style: 'currency',
        currency: 'BRL'
    }).format(preco);
}

// Escapar HTML para prevenir XSS
function escapeHtml(text) {
    const div = document.createElement('div');
    div.textContent = text;
    return div.innerHTML;
}

