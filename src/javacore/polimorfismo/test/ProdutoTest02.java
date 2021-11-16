package javacore.polimorfismo.test;

import javacore.polimorfismo.dominio.Computador;
import javacore.polimorfismo.dominio.Laptop;
import javacore.polimorfismo.dominio.Produto;
import javacore.polimorfismo.dominio.Tomate;
import javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("NUC10i7", 11000d);

        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("--------------------");

        Produto produto2 = new Laptop("DELL Latitude", 7500d);

        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());

        System.out.println("--------------------");

        Produto produto3 = new Tomate("Tomate Cereja", 6d);

        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.calcularImposto());
    }
}
