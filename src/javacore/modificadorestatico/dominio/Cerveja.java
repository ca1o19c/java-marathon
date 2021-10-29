package javacore.modificadorestatico.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cerveja {
    private String nome;
    private Double teorAlcoolico;
    private static Double[] valores;

    // o - Bloco de inicialização Static é executado quando a JVM carregar classe
    // 1 - Alocado espaco em memoria para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    // 3 - Bloco de inicialização é inicializado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 1");
        Cerveja.mockaValoresDosMercados().forEach(System.out::println);
        System.out.println();
    }

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
        System.out.println();
    }

    public Cerveja(String nome, Double teorAlcoolico) {
        this.nome = nome;
        this.teorAlcoolico = teorAlcoolico;
    }

    public Cerveja() {
        System.out.println("Dentro do construtor");
        Cerveja.mockaValoresDosMercados().forEach(System.out::println);
        System.out.println();
    }

    public static List<String> mockaValoresDosMercados() {
        Cerveja.valores = new Double[6];
        Random aux = new Random();

        for (int i = 0; i < Cerveja.valores.length; i++) {
            Cerveja.valores[i] = Math.floor((i + 8d) * aux.nextDouble());
        }

        return Cerveja.montaValoresDosMercados();
    }

    private static List<String> montaValoresDosMercados() {
        ArrayList<String> retorno = new ArrayList<>();
        var aux = "";

        for (int i = 0; i < Cerveja.valores.length; i++) {
            aux = "MERCADO " + i + " = R$ " + Cerveja.valores[i];
            retorno.add(aux);
        }

        return retorno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getTeorAlcoolico() {
        return teorAlcoolico;
    }

    public void setTeorAlcoolico(Double teorAlcoolico) {
        this.teorAlcoolico = teorAlcoolico;
    }

    public static Double[] getValores() {
        return Cerveja.valores;
    }
}
