package br.com.garbotech.arquitetura_hexagonal.core.domain;

import lombok.Data;

@Data
public class Product {

    private Long id;
    private String name;
    private ProductGroup group;
    private Integer quantity;
    private Double price;
}
