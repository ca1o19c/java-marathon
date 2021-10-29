package javacore.associacao.dominio;

import java.util.Arrays;
import java.util.Objects;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public void imprime() {
        System.out.println(this.nome);

        if (jogadores == null) return;

        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return Objects.equals(nome, time.nome) && Arrays.equals(jogadores, time.jogadores);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nome);
        result = 31 * result + Arrays.hashCode(jogadores);
        return result;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + Arrays.toString(jogadores) +
                '}';
    }
}
