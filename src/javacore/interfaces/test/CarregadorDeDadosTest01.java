package javacore.interfaces.test;

import javacore.interfaces.dominio.CarregadorDeArquivos;
import javacore.interfaces.dominio.CarregadorDeBancoDeDados;

public class CarregadorDeDadosTest01 {
    public static void main(String[] args) {
        var carregadorDeBancoDeDados = new CarregadorDeBancoDeDados();
        var carregadorDeArquivos = new CarregadorDeArquivos();

        carregadorDeBancoDeDados.carregar();
        carregadorDeArquivos.carregar();
    }
}
