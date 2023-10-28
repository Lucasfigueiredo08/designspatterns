package com.examples.designpatterns.designscomportamentais.strategy.impl;

import com.examples.designpatterns.designscomportamentais.strategy.contrato.ShippingStrategy;

public class FlatRateShipping implements ShippingStrategy {

    private double flatRate;

    public FlatRateShipping(double flatRate) {
        this.flatRate = flatRate;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return flatRate;
    }
}
