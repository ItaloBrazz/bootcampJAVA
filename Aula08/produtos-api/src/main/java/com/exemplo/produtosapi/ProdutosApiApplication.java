package com.exemplo.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProdutosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApiApplication.class, args);
		System.out.println("\n=================================");
		System.out.println("API de Produtos está rodando!");
		System.out.println("http://localhost:8585/produtos");
		System.out.println("=================================\n");
	}

}