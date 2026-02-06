package com.exemplo.produtosapi.exception;

public class ProdutoNotFoundException extends RuntimeException {

    public ProdutoNotFoundException(Long id) {
        super("Produto não encontrado (id=" + id + ")");
    }
}











