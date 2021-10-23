package javacore.modificadorestatico.test;

import javacore.modificadorestatico.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("Fiat Mobi", 220);
        Carro c2 = new Carro("BMW", 280);
        Carro c3 = new Carro("Toro", 240);

        System.out.println(Carro.velocidadeLimite);
        Carro.velocidadeLimite = 180;
        System.out.println(Carro.velocidadeLimite);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
