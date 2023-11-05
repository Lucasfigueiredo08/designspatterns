package com.examples.designpatterns.designscomportamentais.command.comandos;

import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

public class LigarDispositivo implements Command {
    private Dispositivo dispositivo;

    public LigarDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.ligar();
    }

    @Override
    public void undo() {
        dispositivo.desligar();
    }
}
