package com.examples.designpatterns.designsdecriacao.factorymethod.impl;

import com.examples.designpatterns.designsdecriacao.factorymethod.Veiculo;

public class Carro implements Veiculo {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo");
    }
}
