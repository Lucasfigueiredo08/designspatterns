package com.examples.designpatterns.designsdecriacao.prototype;

import com.examples.designpatterns.designsdecriacao.prototype.impl.Circulo;
import com.examples.designpatterns.designsdecriacao.prototype.impl.Retangulo;
import com.examples.designpatterns.designsdecriacao.prototype.interfaces.Forma;

public class Main {

    /** Prototype
     * Em resumo, o padrão Prototype é uma técnica eficaz para economizar recursos de criação de objetos,
     * especialmente em situações onde a criação de instâncias é cara ou complexa. Ele promove a flexibilidade e reutilização de código ao permitir
     * a clonagem de objetos existentes para criar novos.
     * @param args
     */

    public static void main(String[] args) {
        Forma originalCirculo = new Circulo();
        originalCirculo.desenhar();

        Forma cloneCirculo = originalCirculo.clonar();
        cloneCirculo.desenhar();

        Forma originalRetangulo = new Retangulo();
        originalRetangulo.desenhar();

        Forma cloneRetangulo = originalRetangulo.clonar();
        cloneRetangulo.desenhar();

    }
}
