package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        final var jogador = new Jogador("Pelé");
        final var time = new Time("Seleção Brasileira");

        jogador.setTime(time);
        jogador.imprime();
    }
}
