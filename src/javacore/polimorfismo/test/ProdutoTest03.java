package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Laptop;
import javacore.polimorfismo.dominio.Televisao;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        var computador = new Computador("NUC10i7", 11000d);
        var laptop = new Laptop("DELL Latitude", 7500d);
        var tomate = new Tomate("Tomate cereja", 6d);
        var televisao = new Televisao("Samsung 50\"", 5000d);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("");
        CalculadoraImposto.calcularImposto(laptop);
        System.out.println("");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
