package com.examples.designpatterns.designsdecriacao.prototype.interfaces;

public interface Forma extends Cloneable {
    void desenhar();
    Forma clonar();
}
