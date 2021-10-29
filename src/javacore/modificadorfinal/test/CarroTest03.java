package javacore.modificadorfinal.test;

import javacore.modificadorfinal.dominio.Carro;
import javacore.modificadorfinal.dominio.Ferrari;

public class CarroTest03 {
    public static void main(String[] args) {
        var carro = new Carro();

        carro.setNome("Fiat Mobi");

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("Kuririn");

        System.out.println(carro);

        var ferrari = new Ferrari();

        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
