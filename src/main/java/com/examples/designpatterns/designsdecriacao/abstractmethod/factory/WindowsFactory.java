package com.examples.designpatterns.designsdecriacao.abstractmethod.factory;

import com.examples.designpatterns.designsdecriacao.abstractmethod.impl.WindowsButton;
import com.examples.designpatterns.designsdecriacao.abstractmethod.impl.WindowsWindow;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractButton;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractWindow;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public AbstractButton createButton() {
        return new WindowsButton();
    }

    @Override
    public AbstractWindow createWindow(String title) {
        return new WindowsWindow(title);
    }
}
