package com.examples.designpatterns.designscomportamentais.command.comandos;

import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

public class DesligarDispositivo implements Command {

    private Dispositivo dispositivo;

    public DesligarDispositivo(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.desligar();
    }

    @Override
    public void undo() {
        dispositivo.ligar();
    }
}
