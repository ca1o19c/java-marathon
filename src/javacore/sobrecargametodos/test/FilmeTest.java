package javacore.sobrecargametodos.test;

import javacore.sobrecargametodos.dominio.Filme;

import java.util.List;

public class FilmeTest {
    public static void main(String[] args) {
        Filme filme = new Filme();

        String titulo = "Homem Aranha";
        double imdb = 7.89;
        int ano = 2002;
        List<String> escritores = List.of("Stan Lee", "Steve Ditko", "David Koepp");

        filme.init(titulo, imdb, ano, escritores);
        filme.imprime();
    }
}
