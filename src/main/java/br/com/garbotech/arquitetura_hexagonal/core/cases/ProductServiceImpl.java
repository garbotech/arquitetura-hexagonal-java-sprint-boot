package br.com.garbotech.arquitetura_hexagonal.core.cases;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;
import br.com.garbotech.arquitetura_hexagonal.core.ports.cases.ProductService;
import br.com.garbotech.arquitetura_hexagonal.core.ports.queues.AsyncProcess;
import br.com.garbotech.arquitetura_hexagonal.core.ports.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

/**
 * Regras de negócio
 */
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;
    AsyncProcess asyncProcess;

    @Override
    public Product save(Product product) {
        var productSaved = productRepository.save(product);
        asyncProcess.sent(productSaved);
        return productSaved;
    }

    @Override
    public Product getById(Long id) {
        return productRepository.getById(id);
    }
}
