package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.*;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest04 {
    public static void main(String[] args) {
        Produto produto = new Computador("NUC10i7", 11000d);

        var tomate = new Tomate("Tomate cereja", 6d);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("");
        CalculadoraImposto.calcularImposto(produto);

    }
}
