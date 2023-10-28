package com.examples.designpatterns.designscomportamentais.observer;

import com.examples.designpatterns.designscomportamentais.observer.impl.WeatherDisplay;
import com.examples.designpatterns.designscomportamentais.observer.impl.WeatherStation;

public class Main {

    public static void main(String[] args) {

        /**
         * Define uma depedência de um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos
         * os seus dependentes são notificados
         */

        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay(); //observer
        WeatherDisplay display2 = new WeatherDisplay(); //observer

        weatherStation.setWeather("Ensolarado");

        weatherStation.removeObserver(display2);

        weatherStation.notifyObserver("Chuvoso");

    }
}
