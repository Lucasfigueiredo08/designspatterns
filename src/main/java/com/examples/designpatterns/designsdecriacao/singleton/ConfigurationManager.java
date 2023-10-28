package com.examples.designpatterns.designsdecriacao.singleton;

public class ConfigurationManager {
    /* O Singleton é um padrão de projeto de criação, que garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a essa instância. Isso é útil quando você quer ter exatamente uma única instância de uma classe para coordenar ações em todo o sistema.

        A implementação típica do Singleton envolve:

        1. Um construtor privado: Isso impede a criação de novas instâncias fora da classe.
        2. Uma variável estática privada para armazenar a instância única.
        3. Um método público estático para retornar a instância.
 */

    private static ConfigurationManager instance;

    private String configFile;

    private ConfigurationManager() {
        // Construtor privado para evitar a criação de instâncias
        configFile = "config.properties"; // Exemplo de configuração padrão
    }

    public static ConfigurationManager getInstance() {
        if( instance == null){
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfigFile(){
        return configFile;
    }

    public void setConfigFile(String newConfigFile){
        configFile = newConfigFile;
    }
}
