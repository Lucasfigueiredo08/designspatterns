package com.examples.designpatterns.designscomportamentais.observer.impl;

import com.examples.designpatterns.designscomportamentais.observer.contrato.Observer;
import com.examples.designpatterns.designscomportamentais.observer.contrato.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String weather;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void setWeather(String newWeather){
        this.weather = newWeather;
        notifyObserver("Nova previsão do tempo: " + newWeather);
    }


}
