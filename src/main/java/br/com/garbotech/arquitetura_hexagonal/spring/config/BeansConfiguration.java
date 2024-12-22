package br.com.garbotech.arquitetura_hexagonal.spring.config;

import br.com.garbotech.arquitetura_hexagonal.core.cases.ProductServiceImpl;
import br.com.garbotech.arquitetura_hexagonal.core.ports.cases.ProductService;
import br.com.garbotech.arquitetura_hexagonal.core.ports.queues.AsyncProcess;
import br.com.garbotech.arquitetura_hexagonal.core.ports.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {

    @Bean
    public ProductService productService(ProductRepository productRepository, AsyncProcess asyncProcess) {
        return new ProductServiceImpl(productRepository, asyncProcess);
    }
}
