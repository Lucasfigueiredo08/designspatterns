package com.examples.designpatterns.designsdecriacao.builder.model;

public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;

    public Car(String brand, String model, int year, String color) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Carro: " +
                brand + " " +
                model + " (" +
                year + "), Cor: " +
                color;
    }
}
