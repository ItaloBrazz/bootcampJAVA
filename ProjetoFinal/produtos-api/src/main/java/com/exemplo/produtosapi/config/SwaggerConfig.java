package com.exemplo.produtosapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        try {
            Info info = new Info();
            info.setTitle("API de Gerenciamento de Produtos");
            info.setVersion("1.0.0");
            info.setDescription("API REST para gerenciamento de produtos desenvolvida com Spring Boot");
            
            OpenAPI openAPI = new OpenAPI();
            openAPI.setInfo(info);
            return openAPI;
        } catch (Exception e) {
            return new OpenAPI();
        }
    }
}
