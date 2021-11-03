package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Laptop;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatório de imposto do computador ...");

        var imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome() +
                "\nValor " + computador.getValor() +
                "\nImposto a ser pago " + imposto);
    }

    public static void calcularImpostoLaptop(Laptop laptop) {
        System.out.println("Relatório de imposto do laptop ...");

        var imposto = laptop.calcularImposto();
        System.out.println("Laptop " + laptop.getNome() +
                "\nValor " + laptop.getValor() +
                "\nImposto a ser pago " + imposto);
    }
}
