package javacore.modificadorfinal.dominio;

import java.util.Objects;

public class Carro {
    public static final double VELOCIDADE_LIMITE;

    static {
        VELOCIDADE_LIMITE = 220;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVELOCIDADE_LIMITE() {
        return VELOCIDADE_LIMITE;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Double.compare(carro.VELOCIDADE_LIMITE, VELOCIDADE_LIMITE) == 0 && Objects.equals(nome, carro.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, VELOCIDADE_LIMITE);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", VELOCIDADE_LIMITE=" + VELOCIDADE_LIMITE +
                '}';
    }
}
