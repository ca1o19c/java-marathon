package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTes03 {
    public static void main(String[] args) {
        var jogador = new Jogador("Cafu");
        var jogador2 = new Jogador("Pelé");
        var jogadores = new Jogador[]{jogador, jogador2};

        var time = new Time("Brasil");

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        jogador2.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }
}
