package com.examples.designpatterns.designscomportamentais.command.controlador;

import com.examples.designpatterns.designscomportamentais.command.interfaces.Command;

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
}
