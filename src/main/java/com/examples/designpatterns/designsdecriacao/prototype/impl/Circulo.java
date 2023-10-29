package com.examples.designpatterns.designsdecriacao.prototype.impl;

import com.examples.designpatterns.designsdecriacao.prototype.interfaces.Forma;

public class Circulo implements Forma {

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo.");
    }

    @Override
    public Forma clonar() {
        try{
            return (Forma) super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
