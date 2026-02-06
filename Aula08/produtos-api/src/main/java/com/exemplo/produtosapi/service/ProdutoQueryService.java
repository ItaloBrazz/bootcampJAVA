package com.exemplo.produtosapi.service;

import com.exemplo.produtosapi.dto.ProdutoResponseDTO;

import java.util.List;

public interface ProdutoQueryService {

    List<ProdutoResponseDTO> listar();

    ProdutoResponseDTO buscarPorId(Long id);

    List<ProdutoResponseDTO> buscarPorNome(String nome);
}










