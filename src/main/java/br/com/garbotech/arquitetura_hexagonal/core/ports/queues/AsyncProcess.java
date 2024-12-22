package br.com.garbotech.arquitetura_hexagonal.core.ports.queues;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;

public interface AsyncProcess {
    void sent(Product product);
}
