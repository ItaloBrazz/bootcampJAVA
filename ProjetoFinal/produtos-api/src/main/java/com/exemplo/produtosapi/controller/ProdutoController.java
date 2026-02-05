package com.exemplo.produtosapi.controller;

import com.exemplo.produtosapi.dto.ProdutoRequestDTO;
import com.exemplo.produtosapi.dto.ProdutoResponseDTO;
import com.exemplo.produtosapi.service.ProdutoCommandService;
import com.exemplo.produtosapi.service.ProdutoQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    private final ProdutoQueryService produtoQueryService;
    private final ProdutoCommandService produtoCommandService;

    public ProdutoController(ProdutoQueryService produtoQueryService, ProdutoCommandService produtoCommandService) {
        this.produtoQueryService = produtoQueryService;
        this.produtoCommandService = produtoCommandService;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Api de Produtos Rodando com SpringBoot";
    }

    @GetMapping
    public ResponseEntity<List<ProdutoResponseDTO>> listarTodos() {
        return ResponseEntity.ok(produtoQueryService.listar());
    }

    @GetMapping("/busca")
    public ResponseEntity<List<ProdutoResponseDTO>> buscarPorNome(@RequestParam String nome) {
        return ResponseEntity.ok(produtoQueryService.buscarPorNome(nome));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(produtoQueryService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> adicionar(@RequestBody ProdutoRequestDTO dto) {
        ProdutoResponseDTO salvo = produtoCommandService.salvar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(salvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponseDTO> atualizar(@PathVariable Long id, @RequestBody ProdutoRequestDTO dto) {
        return ResponseEntity.ok(produtoCommandService.atualizar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        produtoCommandService.remover(id);
        return ResponseEntity.noContent().build();
    }
}