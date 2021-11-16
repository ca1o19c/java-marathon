package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Laptop;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        var computador = new Computador("NUC10i7", 11000d);
        var laptop = new Laptop("DELL Latitude", 7500d);
        var tomate = new Tomate("Tomate cereja", 6d);

        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("");
        CalculadoraImposto.calcularImpostoLaptop(laptop);
        System.out.println("");
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
