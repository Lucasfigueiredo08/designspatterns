package com.examples.springaop;

import com.examples.springaop.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator calculator = context.getBean(Calculator.class);

        System.out.println("Antes da execução");
        int result = calculator.add(5, 9);

        System.out.println("Result: " + result);

        context.close();
    }
}
