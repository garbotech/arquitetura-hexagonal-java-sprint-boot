package br.com.garbotech.arquitetura_hexagonal.infraestructure.entities;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer quantity;
    private Double price;
    // TODO group

    public static ProductEntity of(Product product) {
        var p = new ProductEntity();
        p.id = product.getId();
        p.name = product.getName();
        p.quantity = product.getQuantity();
        p.price = product.getPrice();
        return p;
    }

    public Product toDomain() {
        var p = new Product();
        p.setId(id);
        p.setName(name);
        p.setPrice(price);
        p.setQuantity(quantity);
        return p;
    }
}
