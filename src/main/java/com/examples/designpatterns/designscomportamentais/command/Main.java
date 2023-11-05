package com.examples.designpatterns.designscomportamentais.command;

import com.examples.designpatterns.designscomportamentais.command.comandos.DesligarDispositivo;
import com.examples.designpatterns.designscomportamentais.command.comandos.DiminuirVolume;
import com.examples.designpatterns.designscomportamentais.command.controlador.ControleRemoto;
import com.examples.designpatterns.designscomportamentais.command.comandos.AumentarVolume;
import com.examples.designpatterns.designscomportamentais.command.comandos.LigarDispositivo;
import com.examples.designpatterns.designscomportamentais.command.model.Dispositivo;

public class Main {

    /**
     * Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações,
     * fila ou registar solicitações, além de oferecer suporte a operações desfazer.
     * @param args
     * @throws InterruptedException
     */

    public static void main(String[] args) throws InterruptedException {
        Dispositivo dispositivo = new Dispositivo();
        ControleRemoto controle = new ControleRemoto();

        LigarDispositivo ligarComando = new LigarDispositivo(dispositivo);
        AumentarVolume aumentarVolumeComando = new AumentarVolume(dispositivo);

        controle.executarComando(ligarComando);
        controle.executarComando(aumentarVolumeComando);
        controle.executarComando(aumentarVolumeComando);
        controle.executarComando(aumentarVolumeComando);

        System.out.println("Pausa de 2 segundos");
        Thread.sleep(2000);

        controle.desfazerUltimoComando();
        controle.desfazerUltimoComando();
        controle.desfazerComando(new DiminuirVolume(dispositivo), dispositivo);
        controle.desfazerComando(new DesligarDispositivo(dispositivo), dispositivo);

    }
}
