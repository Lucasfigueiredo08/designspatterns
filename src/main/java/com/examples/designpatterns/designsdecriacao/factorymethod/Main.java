package com.examples.designpatterns.designsdecriacao.factorymethod;

import com.examples.designpatterns.designsdecriacao.factorymethod.impl.FabricaCarros;
import com.examples.designpatterns.designsdecriacao.factorymethod.impl.FabricaMotos;
import com.examples.designpatterns.designsdecriacao.factorymethod.impl.Moto;

public class Main {

    /** Factory method
     *  Define uma interface para criar um objeto, mas deixa a escolha da sua classe de implementação para as subclasses
     * @param args
     */

    public static void main(String[] args) {
        FabricaVeiculos fabricaCarros = new FabricaCarros();
        Veiculo meuCarro = fabricaCarros.criarVeiculo();
        meuCarro.mover();

        FabricaVeiculos fabricaMotos = new FabricaMotos();
        Veiculo minhaMoto = fabricaMotos.criarVeiculo();
        minhaMoto.mover();

    }
}
