package com.examples.designpatterns.designsdecriacao.factorymethod.impl;

import com.examples.designpatterns.designsdecriacao.factorymethod.FabricaVeiculos;
import com.examples.designpatterns.designsdecriacao.factorymethod.Veiculo;

public class FabricaMotos extends FabricaVeiculos {
    @Override
    public Veiculo criarVeiculo() {
        return new Moto();
    }
}
