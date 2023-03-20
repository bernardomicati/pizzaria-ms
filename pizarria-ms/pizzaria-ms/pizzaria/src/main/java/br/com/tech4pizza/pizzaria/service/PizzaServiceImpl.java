package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4pizza.pizzaria.model.Pizza;
import br.com.tech4pizza.pizzaria.repository.PizzaRepository;
import br.com.tech4pizza.pizzaria.shared.PizzaCompletoDto;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;

@Service
public class PizzaServiceImpl implements PizzaService {
  @Autowired
  private PizzaRepository repositorio;

  @Override
  public List<PizzaCompletoDto> obterTodas() {
    List<Pizza> pizzas = repositorio.findAll();
    
    return pizzas.stream()
                .map(p -> new ModelMapper().map(p, PizzaCompletoDto.class))
                .collect(Collectors.toList());
  }

  @Override
  public Optional<PizzaDto> obterPorId(String id) {
    Optional<Pizza> pizza  = repositorio.findById(id);

    if (pizza.isPresent()) {
      return Optional.of(new ModelMapper().map(pizza.get(), PizzaDto.class));
    }
    return Optional.empty();
  }

  @Override
  public void excluirPorId(String id) {
    repositorio.deleteById(id);
  }

  @Override
  public PizzaCompletoDto cadastrar(PizzaCompletoDto dto) {
    Pizza pizza = new ModelMapper().map(dto, Pizza.class);
    repositorio.save(pizza);
    return new ModelMapper().map(pizza, PizzaCompletoDto.class);  
  }

  @Override
  public Optional<PizzaCompletoDto> atualizarPorId(String id, PizzaCompletoDto dto) { 
    Optional<Pizza> retorno = repositorio.findById(id);

    if (retorno.isPresent()) {
      Pizza pizza = new ModelMapper().map(dto, Pizza.class);
      pizza.setId(id);
      repositorio.save(pizza);
      return Optional.of(new ModelMapper().map(pizza, PizzaCompletoDto.class));
    } else {
      return Optional.empty();
    }
    
   
  }
  
}
