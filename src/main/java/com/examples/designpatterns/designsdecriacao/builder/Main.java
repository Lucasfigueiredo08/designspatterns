package com.examples.designpatterns.designsdecriacao.builder;

import com.examples.designpatterns.designsdecriacao.builder.impl.CarBuilder;
import com.examples.designpatterns.designsdecriacao.builder.model.Car;

public class Main {

    /**
     * Separa a construção de um objeto complexo de sua representação, permitindo a mesma construção
     * criar diferentes representações
     * @param args
     */

    public static void main(String[] args) {
        CarBuilder builder = new CarBuilder();

        Car car1 = builder.setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2022)
                .setColor("Prata")
                .build();

        Car car2 = builder.setBrand("Toyota")
                .setModel("Etios")
                .setYear(2013)
                .setColor("Prata")
                .build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
