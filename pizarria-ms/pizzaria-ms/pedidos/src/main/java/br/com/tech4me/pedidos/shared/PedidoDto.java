package br.com.tech4me.pedidos.shared;

import br.com.tech4me.pedidos.model.Pizza;

public class PedidoDto {
    private String nomeCliente;
    private String idPizza;
    private Pizza dadosPizza;
    private Double valor;
    
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setIdPizza(String idPizza) {
        this.idPizza = idPizza;
    }
    public String getIdPizza() {
        return idPizza;
    }
    public Pizza getDadosPizza() {
        return dadosPizza;
    }
    public void setDadosPizza(Pizza dadosPizza) {
        this.dadosPizza = dadosPizza;
    }

}
