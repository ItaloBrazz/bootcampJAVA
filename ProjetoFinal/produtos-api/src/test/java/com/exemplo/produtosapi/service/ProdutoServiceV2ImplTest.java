package com.exemplo.produtosapi.service;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.exception.BusinessRuleException;
import com.exemplo.produtosapi.repository.ProdutoRepository;
import com.exemplo.produtosapi.service.impl.ProdutoServiceV2Impl;
import com.exemplo.produtosapi.service.rules.ProdutoRule;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class ProdutoServiceV2ImplTest {

    @Test
    void deveFalharAoSalvarQuandoNomeVazio() {
        ProdutoRepository repo = mock(ProdutoRepository.class);
        ProdutoRule regraNomeObrigatorio = new ProdutoRule() {
            @Override
            public void validarParaSalvar(ProdutoRequestDTO dto) {
                if (dto.getNome() == null || dto.getNome().trim().isEmpty()) {
                    throw new BusinessRuleException("Nome do produto é obrigatório.");
                }
            }
        };

        ProdutoServiceV2Impl service = new ProdutoServiceV2Impl(repo, List.of(regraNomeObrigatorio));

        assertThrows(BusinessRuleException.class, () -> service.salvar(new ProdutoRequestDTO("", 10.0, 1)));
    }
}




