package javacore.modificadorfinal.dominio;

import java.util.Objects;

public class Carro {
    public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 220;
    }

    public final Comprador COMPRADOR = new Comprador();
    private String nome;

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(COMPRADOR, carro.COMPRADOR) && Objects.equals(nome, carro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(COMPRADOR, nome);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "COMPRADOR=" + COMPRADOR +
                ", nome='" + nome + '\'' +
                '}';
    }
}
