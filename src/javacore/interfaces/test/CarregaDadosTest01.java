package javacore.interfaces.test;

import javacore.interfaces.dominio.CarregaDeArquivos;
import javacore.interfaces.dominio.CarregaDoBancoDeDados;

public class CarregaDadosTest01 {
    public static void main(String[] args) {
        var carregaDoBancoDeDados = new CarregaDoBancoDeDados();
        var carregaDeArquivos = new CarregaDeArquivos();

        carregaDoBancoDeDados.carregar();
        carregaDeArquivos.carregar();

        carregaDoBancoDeDados.remove();
        carregaDeArquivos.remove();

        carregaDoBancoDeDados.verificarPermissao();
        carregaDeArquivos.verificarPermissao();
    }
}
