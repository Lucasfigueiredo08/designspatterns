package com.examples.designpatterns.designscomportamentais.strategy.impl;

import com.examples.designpatterns.designscomportamentais.strategy.contrato.ShippingStrategy;

public class VariableRateShipping implements ShippingStrategy {

    private double ratePerKg;

    public VariableRateShipping(double ratePerKg) {
        this.ratePerKg = ratePerKg;
    }

    @Override
    public double calculateShippingCost(double weight) {
        return ratePerKg * weight;
    }
}
