package com.exemplo.produtosapi.repository;

import com.exemplo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    java.util.List<Produto> findByNomeContainingIgnoreCase(String nome);
}
