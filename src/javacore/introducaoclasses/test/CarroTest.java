package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro fusca = new Carro();

        fusca.nome = "Volkswagen Fusca";
        fusca.modelo = "Typ 1";
        fusca.ano = 1938;

        System.out.println("nome: " + fusca.nome + " modelo: " + fusca.modelo + " ano: " + fusca.ano);

        Carro mobi = new Carro();

        mobi.nome = "Fiat Mobi";
        mobi.modelo = "Like";
        mobi.ano = 2022;

        System.out.println("nome: " + mobi.nome + " modelo: " + mobi.modelo + " ano: " + mobi.ano);

        mobi = fusca;

        System.out.println("nome: " + mobi.nome + " modelo: " + mobi.modelo + " ano: " + mobi.ano);
    }
}
