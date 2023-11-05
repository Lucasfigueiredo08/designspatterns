package com.examples.springaop;

import org.springframework.stereotype.Component;

public class Calculator {

    public int add(int a, int b){
        System.out.println( "A soma é feita antes de executar o methodo a ser realizado depois da execução: " + a + b);
        return a + b;
    }

    public int subtract(int a, int b){
        System.out.println(a - b);
        return a - b;
    }
}
