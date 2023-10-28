package com.examples.designpatterns.designsdecriacao.builderItemPedido.impl;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> itens = new ArrayList<>();
    private String endereco;
    private String metodoDePagamento;

    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setMetodoDePagamento(String metodoDePagamento){
        this.metodoDePagamento = metodoDePagamento;
    }

    public double calcularTotal(){
        return itens.stream().mapToDouble(ItemPedido::getTotal).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Itens do Pedido:\n");
        for(ItemPedido item: itens) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total de Pedido: $ ").append(calcularTotal()).append("\n");
        sb.append("Endereço de Envio: ").append(endereco).append("\n");
        sb.append("Método de Pagamento: ").append(metodoDePagamento);
        return sb.toString();
    }
}
