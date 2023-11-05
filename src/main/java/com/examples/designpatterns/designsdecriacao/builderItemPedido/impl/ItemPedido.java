package com.examples.designpatterns.designsdecriacao.builderItemPedido.impl;

public class ItemPedido {

    private String produto;
    private double preco;
    private int quantidade;

    public ItemPedido(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Item: " +
                produto + ", Preço Unitário: $" +
                preco + ", Quantidade: " +
                quantidade + ", Total: $ " + getTotal();
    }
}
