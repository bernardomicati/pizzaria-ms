package br.com.tech4pizza.pizzaria.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4pizza.pizzaria.shared.PizzaCompletoDto;
import br.com.tech4pizza.pizzaria.shared.PizzaDto;


public interface PizzaService {
  List<PizzaCompletoDto> obterTodas();
  Optional<PizzaDto> obterPorId(String id);
  void excluirPorId(String id);
  PizzaCompletoDto cadastrar(PizzaCompletoDto dto);
  Optional<PizzaCompletoDto> atualizarPorId(String id, PizzaCompletoDto dto);
}
