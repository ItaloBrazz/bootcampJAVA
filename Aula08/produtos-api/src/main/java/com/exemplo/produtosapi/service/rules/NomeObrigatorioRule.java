package com.exemplo.produtosapi.service.rules;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.exception.BusinessRuleException;
import org.springframework.stereotype.Component;

@Component
public class NomeObrigatorioRule implements ProdutoRule {

    @Override
    public void validarParaSalvar(ProdutoRequestDTO dto) {
        validar(dto);
    }

    @Override
    public void validarParaAtualizar(Long id, ProdutoRequestDTO dto) {
        validar(dto);
    }

    private void validar(ProdutoRequestDTO dto) {
        if (dto == null || dto.getNome() == null || dto.getNome().trim().isEmpty()) {
            throw new BusinessRuleException("Nome do produto é obrigatório.");
        }
    }
}


