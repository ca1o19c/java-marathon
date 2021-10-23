package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JogadorTest01 {
    public static void main(String[] args) {
        final var jogador1 = new Jogador("Pelé");
        final var jogador2 = new Jogador("Romário");
        final var jogador3 = new Jogador("Cafu");

        var jogadores = new Jogador[]{jogador1, jogador2, jogador3};

        final var listaDeJogadores = Arrays.stream(jogadores)
                .map(Jogador::getNome).collect(Collectors.toList());

        listaDeJogadores.forEach(System.out::println);
    }
}
