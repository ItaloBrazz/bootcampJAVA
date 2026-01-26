package com.exemplo.produtosapi.config;

import com.exemplo.produtosapi.model.Produto;
import com.exemplo.produtosapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public void run(String... args) throws Exception {
        if (produtoRepository.count() == 0) {
            produtoRepository.save(new Produto("Notebook Dell Inspiron 15", 3499.99, 12));
            produtoRepository.save(new Produto("Mouse Logitech MX Master 3", 599.90, 25));
            produtoRepository.save(new Produto("Teclado Mecânico RGB", 799.00, 18));
            produtoRepository.save(new Produto("Monitor LG UltraWide 29\"", 1899.99, 8));
            produtoRepository.save(new Produto("Webcam Logitech C920", 699.90, 15));
            produtoRepository.save(new Produto("Headset HyperX Cloud II", 899.00, 20));
            produtoRepository.save(new Produto("SSD Samsung 1TB NVMe", 599.99, 30));
            produtoRepository.save(new Produto("Memória RAM 16GB DDR4", 449.90, 22));
            produtoRepository.save(new Produto("Placa de Vídeo RTX 4060", 2499.99, 5));
            produtoRepository.save(new Produto("Gabinete Gamer RGB", 399.90, 14));
            produtoRepository.save(new Produto("Fonte 750W 80 Plus Gold", 699.00, 10));
            produtoRepository.save(new Produto("Cooler Master Hyper 212", 299.90, 16));
            produtoRepository.save(new Produto("Mousepad Gamer XXL", 149.90, 35));
            produtoRepository.save(new Produto("Hub USB-C 7 Portas", 199.90, 28));
            produtoRepository.save(new Produto("Cabo HDMI 2.1 3m", 89.90, 40));
            produtoRepository.save(new Produto("Impressora HP LaserJet", 1299.99, 6));
            produtoRepository.save(new Produto("Tablet Samsung Galaxy Tab", 1999.99, 9));
            produtoRepository.save(new Produto("Smartphone Xiaomi 13", 3299.99, 11));
            produtoRepository.save(new Produto("Smartwatch Apple Watch", 2499.99, 7));
            produtoRepository.save(new Produto("Caixa de Som JBL Charge 5", 899.90, 19));
            
            System.out.println("\n✅ 20 produtos cadastrados com sucesso!\n");
        }
    }
}

