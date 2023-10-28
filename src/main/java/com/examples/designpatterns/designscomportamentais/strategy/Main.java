package com.examples.designpatterns.designscomportamentais.strategy;

import com.examples.designpatterns.designscomportamentais.strategy.contrato.ShippingStrategy;
import com.examples.designpatterns.designscomportamentais.strategy.impl.FlatRateShipping;
import com.examples.designpatterns.designscomportamentais.strategy.impl.FreeShipping;
import com.examples.designpatterns.designscomportamentais.strategy.impl.VariableRateShipping;

public class Main {

    /** Padrão de projeto comportamental Strategy
     * 1. Define uma família de algoritmos, encapsula cada um e os torna intercambiáveis.
     */

    public static void main(String[] args) {
        ShippingStrategy flatRate = new FlatRateShipping(5.0);
        ShippingStrategy variableRateShipping = new VariableRateShipping(5.0);
        ShippingStrategy freeRate = new FreeShipping();

        double weight = 10.0;

        double costWithFlatRate = flatRate.calculateShippingCost(weight);
        double costVariableRate = variableRateShipping.calculateShippingCost(weight);
        double costFreeRate = freeRate.calculateShippingCost(weight);

        System.out.println("Custo com frete fixo: " + costWithFlatRate);
        System.out.println("Custo com frete variável: " + costVariableRate);
        System.out.println("Custo com frete grátis: " + costFreeRate);
    }
}
