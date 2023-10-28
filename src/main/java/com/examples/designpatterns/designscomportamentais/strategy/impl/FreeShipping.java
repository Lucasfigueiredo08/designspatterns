package com.examples.designpatterns.designscomportamentais.strategy.impl;

import com.examples.designpatterns.designscomportamentais.strategy.contrato.ShippingStrategy;

public class FreeShipping implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight) {
        return 0.0;
    }
}
