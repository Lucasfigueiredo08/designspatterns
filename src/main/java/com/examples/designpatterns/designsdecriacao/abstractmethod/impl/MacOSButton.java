package com.examples.designpatterns.designsdecriacao.abstractmethod.impl;

import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractButton;

public class MacOSButton implements AbstractButton {
    @Override
    public void click() {
        System.out.println("Butão do masOS clicado");
    }
}
