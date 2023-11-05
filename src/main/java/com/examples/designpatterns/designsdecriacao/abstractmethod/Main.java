package com.examples.designpatterns.designsdecriacao.abstractmethod;

import com.examples.designpatterns.designsdecriacao.abstractmethod.factory.MacOSFactory;
import com.examples.designpatterns.designsdecriacao.abstractmethod.factory.WindowsFactory;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractButton;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractWindow;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.GUIFactory;

public class Main {
    /**
     *  Fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
     * @param args
     */

    public static void main(String[] args) {
        GUIFactory windowsFactory = new WindowsFactory();
        AbstractButton windowsButton =  windowsFactory.createButton();
        AbstractWindow windowsWindow = windowsFactory.createWindow("Minha janela Windows");

        windowsButton.click();
        windowsWindow.render();

        GUIFactory macOSFactory = new MacOSFactory();
        AbstractButton macOSButton =  macOSFactory.createButton();
        AbstractWindow macOSWindow = macOSFactory.createWindow("Minha janela MacOS");

        macOSButton.click();
        macOSWindow.render();

    }
}
