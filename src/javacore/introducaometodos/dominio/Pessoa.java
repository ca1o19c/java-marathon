package javacore.introducaometodos.dominio;

import static java.lang.Math.max;

public class Pessoa {
    private String nome;
    private int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = max(idade, 0);
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
}
