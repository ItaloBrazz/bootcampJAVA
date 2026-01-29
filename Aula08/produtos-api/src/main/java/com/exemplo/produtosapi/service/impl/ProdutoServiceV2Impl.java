package com.exemplo.produtosapi.service.impl;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.dto.ProdutoResponseDTO;
import com.exemplo.produtosapi.exception.ProdutoNotFoundException;
import com.exemplo.produtosapi.mapper.ProdutoMapper;
import com.exemplo.produtosapi.model.Produto;
import com.exemplo.produtosapi.repository.ProdutoRepository;
import com.exemplo.produtosapi.service.ProdutoService;
import com.exemplo.produtosapi.service.rules.ProdutoRule;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Primary
@Service
public class ProdutoServiceV2Impl implements ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final List<ProdutoRule> rules;

    public ProdutoServiceV2Impl(ProdutoRepository produtoRepository, List<ProdutoRule> rules) {
        this.produtoRepository = produtoRepository;
        this.rules = rules;
    }

    @Override
    public ProdutoResponseDTO salvar(ProdutoRequestDTO dto) {
        rules.forEach(r -> r.validarParaSalvar(dto));
        Produto salvo = produtoRepository.save(ProdutoMapper.toEntity(dto));
        return ProdutoMapper.toResponse(salvo);
    }

    @Override
    public List<ProdutoResponseDTO> listar() {
        return produtoRepository.findAll().stream().map(ProdutoMapper::toResponse).toList();
    }

    @Override
    public ProdutoResponseDTO buscarPorId(Long id) {
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new ProdutoNotFoundException(id));
        return ProdutoMapper.toResponse(produto);
    }

    @Override
    public ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto) {
        rules.forEach(r -> r.validarParaAtualizar(id, dto));
        Produto produto = produtoRepository.findById(id).orElseThrow(() -> new ProdutoNotFoundException(id));
        ProdutoMapper.updateEntity(produto, dto);
        Produto salvo = produtoRepository.save(produto);
        return ProdutoMapper.toResponse(salvo);
    }

    @Override
    public void remover(Long id) {
        if (!produtoRepository.existsById(id)) {
            throw new ProdutoNotFoundException(id);
        }
        produtoRepository.deleteById(id);
    }

    @Override
    public List<ProdutoResponseDTO> buscarPorNome(String nome) {
        return produtoRepository.findByNomeContainingIgnoreCase(nome).stream().map(ProdutoMapper::toResponse).toList();
    }
}



