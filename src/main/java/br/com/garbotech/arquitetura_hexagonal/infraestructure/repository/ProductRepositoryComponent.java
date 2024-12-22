package br.com.garbotech.arquitetura_hexagonal.infraestructure.repository;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;
import br.com.garbotech.arquitetura_hexagonal.core.ports.repository.ProductRepository;
import br.com.garbotech.arquitetura_hexagonal.infraestructure.entities.ProductEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@AllArgsConstructor
public class ProductRepositoryComponent implements ProductRepository {

    private final ProductRepositoryJpa jpa;

    @Override
    public Product save(Product product) {
        var entity = jpa.save(ProductEntity.of(product));
        return entity.toDomain();
    }

    @Override
    public Product getById(Long id) {
        return Optional.ofNullable(jpa.getById(id))
                .map(ProductEntity::toDomain)
                .orElse(null);
    }
}
