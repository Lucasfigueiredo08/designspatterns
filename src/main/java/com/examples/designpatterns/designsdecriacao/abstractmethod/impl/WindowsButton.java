package com.examples.designpatterns.designsdecriacao.abstractmethod.impl;


import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractButton;

public class WindowsButton implements AbstractButton {
    @Override
    public void click() {
        System.out.println("Botão do Windows clicado");
    }
}
