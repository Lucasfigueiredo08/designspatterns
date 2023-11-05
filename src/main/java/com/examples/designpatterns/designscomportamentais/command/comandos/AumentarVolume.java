package com.examples.designpatterns.designscomportamentais.command.comandos;

import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

public class AumentarVolume implements Command {
    private Dispositivo dispositivo;

    public AumentarVolume(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    @Override
    public void execute() {
        dispositivo.aumentarVolume();
    }

    @Override
    public void undo() {
        dispositivo.diminuirVolume();
    }
}
