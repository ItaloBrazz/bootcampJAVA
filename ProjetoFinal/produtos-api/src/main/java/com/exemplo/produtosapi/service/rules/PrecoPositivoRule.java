package com.exemplo.produtosapi.service.rules;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.exception.BusinessRuleException;
import org.springframework.stereotype.Component;

@Component
public class PrecoPositivoRule implements ProdutoRule {

    @Override
    public void validarParaSalvar(ProdutoRequestDTO dto) {
        validar(dto);
    }

    @Override
    public void validarParaAtualizar(Long id, ProdutoRequestDTO dto) {
        validar(dto);
    }

    private void validar(ProdutoRequestDTO dto) {
        if (dto == null || dto.getPreco() == null) {
            throw new BusinessRuleException("Preço do produto é obrigatório.");
        }
        if (dto.getPreco() < 0) {
            throw new BusinessRuleException("Preço do produto não pode ser negativo.");
        }
    }
}


