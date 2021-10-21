package javacore.construtores.test;

import javacore.construtores.dominio.Filme;

import java.util.List;

public class FilmeTest {
    public static void main(String[] args) {
        String titulo = "Homem de Ferro";
        double imdb = 7.89;
        int ano = 2002;
        List<String> escritores = List.of("Stan Lee", "Steve Ditko", "David Koepp");
        String estudio = "Marvel";

        Filme filme = new Filme(titulo, imdb, ano, escritores, estudio);
        filme.imprime();
    }
}
