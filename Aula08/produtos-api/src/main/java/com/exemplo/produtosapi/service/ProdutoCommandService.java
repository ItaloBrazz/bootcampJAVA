package com.exemplo.produtosapi.service;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.dto.ProdutoResponseDTO;

public interface ProdutoCommandService {

    ProdutoResponseDTO salvar(ProdutoRequestDTO dto);

    ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto);

    void remover(Long id);
}










