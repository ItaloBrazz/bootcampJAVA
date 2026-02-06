package com.exemplo.produtosapi.service.rules;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;

public interface ProdutoRule {

    default void validarParaSalvar(ProdutoRequestDTO dto) {
    }

    default void validarParaAtualizar(Long id, ProdutoRequestDTO dto) {
    }
}







