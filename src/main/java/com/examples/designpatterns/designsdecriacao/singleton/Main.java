package com.examples.designpatterns.designsdecriacao.singleton;

public class Main {

    public static void main(String[] args) {
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();

        System.out.println(configurationManager1.getConfigFile());
        System.out.println(configurationManager2.getConfigFile());

        configurationManager1.setConfigFile("new_config.properties");

        System.out.println("Interseção: -------------------------------------------");

        System.out.println(configurationManager1.getConfigFile());
        System.out.println(configurationManager2.getConfigFile());
    }
}
