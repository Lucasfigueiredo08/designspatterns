package com.examples.designpatterns.designscomportamentais.observer.contrato;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver(String message);
}
