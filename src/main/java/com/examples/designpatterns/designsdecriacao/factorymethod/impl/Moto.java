package com.examples.designpatterns.designsdecriacao.factorymethod.impl;

import com.examples.designpatterns.designsdecriacao.factorymethod.Veiculo;

public class Moto implements Veiculo {
    @Override
    public void mover() {
        System.out.println("A moto está se movendo");
    }
}
