package com.examples.designpatterns.designsdecriacao.abstractmethod.repository;

public interface GUIFactory {
    AbstractButton createButton();
    AbstractWindow createWindow(String title);
}
