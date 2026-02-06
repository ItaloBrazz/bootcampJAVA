package com.exemplo.produtosapi.service.rules;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.exception.BusinessRuleException;
import org.springframework.stereotype.Component;

@Component
public class QuantidadeNaoNegativaRule implements ProdutoRule {

    @Override
    public void validarParaSalvar(ProdutoRequestDTO dto) {
        validar(dto);
    }

    @Override
    public void validarParaAtualizar(Long id, ProdutoRequestDTO dto) {
        validar(dto);
    }

    private void validar(ProdutoRequestDTO dto) {
        if (dto == null || dto.getQuantidade() == null) {
            throw new BusinessRuleException("Quantidade do produto é obrigatória.");
        }
        if (dto.getQuantidade() < 0) {
            throw new BusinessRuleException("Quantidade do produto não pode ser negativa.");
        }
    }
}









