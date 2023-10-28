package com.examples.designpatterns.designscomportamentais.observer.impl;

import com.examples.designpatterns.designscomportamentais.observer.contrato.Observer;

public class WeatherDisplay implements Observer {

    private String message;

    @Override
    public void update(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println("Display de previsão do tempo: " + message);
    }
}
