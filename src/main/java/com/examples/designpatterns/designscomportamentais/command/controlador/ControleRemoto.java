package com.examples.designpatterns.designscomportamentais.command.controlador;

import com.examples.designpatterns.designscomportamentais.command.comandos.DesligarDispositivo;
import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

import java.util.Stack;

public class ControleRemoto {

    private Stack<Command> comandos = new Stack<>();

    public void executarComando(Command command){
        command.execute();
        comandos.push(command);
    }

    public void desfazerUltimoComando() {
        if(!comandos.isEmpty()){
            Command comandoDesfeito = comandos.pop();
            comandoDesfeito.undo();
        }
    }

    public void desfazerComando(Command command, Dispositivo dispositivo) {
        if(command.getClass().equals(DesligarDispositivo.class)){
            dispositivo.desligar();
        } else {
            dispositivo.diminuirVolume();
        }
    }
}
