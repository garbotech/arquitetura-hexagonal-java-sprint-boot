package br.com.garbotech.arquitetura_hexagonal.core.ports.cases;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;

public interface ProductService {

    Product save(Product product);

    Product getById(Long id);

}
