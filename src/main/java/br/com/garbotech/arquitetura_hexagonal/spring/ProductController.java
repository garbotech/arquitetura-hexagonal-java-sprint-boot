package br.com.garbotech.arquitetura_hexagonal.spring;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;
import br.com.garbotech.arquitetura_hexagonal.core.ports.cases.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable("id") Long id) {
        return productService.getById(id);
    }
}
