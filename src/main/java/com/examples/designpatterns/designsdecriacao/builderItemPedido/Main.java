package com.examples.designpatterns.designsdecriacao.builderItemPedido;

import com.examples.designpatterns.designsdecriacao.builderItemPedido.impl.Pedido;
import com.examples.designpatterns.designsdecriacao.builderItemPedido.impl.PedidoBuilder;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new PedidoBuilder()
                .adicionarItem("Produto A", 10.0, 2)
                .adicionarItem("Produto B", 20.0, 3)
                .definirEndereco("Rua Irani, 232")
                .definirMetodoDePagamento("Cartão de Crédito")
                .build();

        System.out.println(pedido);

    }
}