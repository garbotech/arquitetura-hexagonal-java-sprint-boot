package br.com.garbotech.arquitetura_hexagonal.core.ports.repository;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;

public interface ProductRepository {

    Product save(Product product);

    Product getById(Long id);

}
