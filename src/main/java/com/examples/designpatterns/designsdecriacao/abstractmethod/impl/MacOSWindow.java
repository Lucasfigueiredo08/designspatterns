package com.examples.designpatterns.designsdecriacao.abstractmethod.impl;

import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractWindow;

public class MacOSWindow implements AbstractWindow {
    private String title;

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void render() {
        System.out.println("Renderizando janela do macOS: " + title);
    }

    public MacOSWindow(String title) {
        this.title = title;
    }
}
