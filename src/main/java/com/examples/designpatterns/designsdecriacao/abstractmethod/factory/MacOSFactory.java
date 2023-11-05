package com.examples.designpatterns.designsdecriacao.abstractmethod.factory;

import com.examples.designpatterns.designsdecriacao.abstractmethod.impl.MacOSButton;
import com.examples.designpatterns.designsdecriacao.abstractmethod.impl.MacOSWindow;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractButton;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.AbstractWindow;
import com.examples.designpatterns.designsdecriacao.abstractmethod.repository.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public AbstractButton createButton() {
        return new MacOSButton();
    }

    @Override
    public AbstractWindow createWindow(String title) {
        return new MacOSWindow(title);
    }
}
