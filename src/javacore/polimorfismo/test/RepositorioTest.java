package javacore.polimorfismo.test;

import javacore.polimorfismo.repositorio.Repositorio;
import javacore.polimorfismo.servico.RepositorioArquivo;
import javacore.polimorfismo.servico.RepositorioBancoDeDados;
import javacore.polimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        repositorio = new RepositorioMemoria();
        repositorio.salvar();

        repositorio = new RepositorioArquivo();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Dragon Ball");
        list.add("Pokemon");
        list.add("Digimon");

        list.forEach(System.out::println);
    }
}
