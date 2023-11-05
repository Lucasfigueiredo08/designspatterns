package com.examples.designpatterns.designscomportamentais.command.comandos;

import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

public class DiminuirVolume implements Command {

    private Dispositivo dispositivo;

    public DiminuirVolume(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.diminuirVolume();
    }

    @Override
    public void undo() {
        dispositivo.aumentarVolume();
    }
}
