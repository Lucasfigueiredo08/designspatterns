package com.examples.designpatterns.designsdecriacao.builderItemPedido.impl;

public class PedidoBuilder {

    private Pedido pedido = new Pedido();

    public PedidoBuilder adicionarItem(String produto, double preco, int quantidade){
        ItemPedido item = new ItemPedido(produto, preco, quantidade);
        pedido.adicionarItem(item);
        return this;
    }

    public PedidoBuilder definirEndereco(String endereco) {
        pedido.setEndereco(endereco);
        return this;
    }

    public PedidoBuilder definirMetodoDePagamento(String metodoDePagamento) {
        pedido.setMetodoDePagamento(metodoDePagamento);
        return this;
    }

    public Pedido  build() {
        return pedido;
    }
}
