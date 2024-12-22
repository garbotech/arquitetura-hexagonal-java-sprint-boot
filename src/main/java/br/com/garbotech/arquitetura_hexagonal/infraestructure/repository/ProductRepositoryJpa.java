package br.com.garbotech.arquitetura_hexagonal.infraestructure.repository;

import br.com.garbotech.arquitetura_hexagonal.infraestructure.entities.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {
}
