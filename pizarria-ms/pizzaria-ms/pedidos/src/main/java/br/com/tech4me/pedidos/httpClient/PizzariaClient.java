package br.com.tech4me.pedidos.httpClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.tech4me.pedidos.model.Pizza;

//O feing faz o papel de selecionar qual tipo de objeto o spring vai gerenciar
@FeignClient(name = "pizzaria", fallback = PizzariaClientFallback.class)
//pizzaria é o nome do microserviço, definido dentro do application.properties
public interface PizzariaClient {

    @RequestMapping(value="/cardapio/{id}", method=RequestMethod.GET)
    Pizza obterPizza(@PathVariable String id);
}

@Component
    class PizzariaClientFallback implements PizzariaClient {
        @Override
        public Pizza obterPizza(String id) {
            return new Pizza();
        }
    }
