package com.examples.designpatterns.designsdecriacao.factorymethod.impl;

import com.examples.designpatterns.designsdecriacao.factorymethod.FabricaVeiculos;
import com.examples.designpatterns.designsdecriacao.factorymethod.Veiculo;

public class FabricaCarros extends FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Carro();
    }
}
