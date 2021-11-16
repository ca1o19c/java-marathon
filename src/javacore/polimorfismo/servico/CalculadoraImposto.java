package javacore.polimorfismo.servico;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Laptop;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;

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

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatório de imposto do tomate ...");

        var imposto = tomate.calcularImposto();
        System.out.println("Laptop " + tomate.getNome() +
                "\nValor " + tomate.getValor() +
                "\nImposto a ser pago " + imposto);
    }

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto ...");

       var imposto = produto.calcularImposto();

        System.out.println("Produto: " + produto.getNome() +
                "\nValor: " + produto.getValor() +
                "\nImposto a ser pago: " + imposto);
    }
}
