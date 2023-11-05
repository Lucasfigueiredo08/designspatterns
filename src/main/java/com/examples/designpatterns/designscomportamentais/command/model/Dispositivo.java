package com.examples.designpatterns.designscomportamentais.command.model;

public class Dispositivo {

    private boolean ligado = false;
    private int volume = 0;

    public void ligar(){
        ligado = true;
        System.out.println("O dispositivo foi ligado.");
    }

    public void desligar(){
        ligado = false;
        System.out.println("O dispositivo foi desligado.");
    }

    public void aumentarVolume(){
        if(ligado && volume < 100) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        }
    }

    public void diminuirVolume(){
        if(ligado && volume > 0) {
            volume--;
            System.out.println("Volume diminuído para " + volume);
        }
    }

}
