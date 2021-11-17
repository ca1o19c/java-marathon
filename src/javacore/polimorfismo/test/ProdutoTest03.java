package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.*;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto computador = new Computador("NUC10i7", 11000d);
        Produto laptop = new Laptop("DELL Latitude", 7500d);
        Produto tomate = new Tomate("Tomate cereja", 6d);
        Produto televisao = new Televisao("Samsung 50\"", 5000d);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("");
        CalculadoraImposto.calcularImposto(laptop);
        System.out.println("");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
