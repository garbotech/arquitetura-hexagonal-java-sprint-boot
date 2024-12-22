package br.com.garbotech.arquitetura_hexagonal.infraestructure.queues;

import br.com.garbotech.arquitetura_hexagonal.core.domain.Product;
import br.com.garbotech.arquitetura_hexagonal.core.ports.queues.AsyncProcess;
import org.springframework.stereotype.Component;

@Component
public class AsyncProcessImpl implements AsyncProcess {

    @Override
    public void sent(Product product) {
        System.out.println("Send product: "+ product.getId());
    }
}
