package com.examples.designpatterns.designsdecriacao.abstractmethod.impl;

import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractWindow;

public class WindowsWindow implements AbstractWindow {

    private String title;


    public WindowsWindow(String title) {
        this.title = title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void render() {
        System.out.println("Renderizando janela do Windows:  " + title);
    }
}
