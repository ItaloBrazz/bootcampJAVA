package com.exemplo.produtosapi.mapper;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.dto.ProdutoResponseDTO;
import com.exemplo.produtosapi.model.Produto;

public final class ProdutoMapper {

    private ProdutoMapper() {
    }

    public static Produto toEntity(ProdutoRequestDTO dto) {
        if (dto == null) return null;
        Integer quantidade = dto.getQuantidade() == null ? 0 : dto.getQuantidade();
        return new Produto(dto.getNome(), dto.getPreco(), quantidade);
    }

    public static ProdutoResponseDTO toResponse(Produto entity) {
        if (entity == null) return null;
        return new ProdutoResponseDTO(entity.getId(), entity.getNome(), entity.getPreco(), entity.getQuantidade());
    }

    public static void updateEntity(Produto entity, ProdutoRequestDTO dto) {
        if (entity == null || dto == null) return;
        entity.setNome(dto.getNome());
        entity.setPreco(dto.getPreco());
        if (dto.getQuantidade() != null) {
            entity.setQuantidade(dto.getQuantidade());
        }
    }
}



