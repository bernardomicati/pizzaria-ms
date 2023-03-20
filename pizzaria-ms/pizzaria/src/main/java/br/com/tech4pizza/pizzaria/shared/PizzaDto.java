package br.com.tech4pizza.pizzaria.shared;

import java.util.List;

public class PizzaDto {
  private String id;
  private String sabor;
  private List<String> ingredientes;
  private String tamanho;

  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getSabor() {
    return sabor;
  }
  public void setSabor(String sabor) {
    this.sabor = sabor;
  }
  
  public List<String> getIngredientes() {
    return ingredientes;
  }
  public void setIngredientes(List<String> ingredientes) {
    this.ingredientes = ingredientes;
  }
  public String getTamanho() {
    return tamanho;
  }
  public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
  }
 
  

  
  
}
