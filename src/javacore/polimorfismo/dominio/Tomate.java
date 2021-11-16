package javacore.polimorfismo.dominio;

import java.util.Objects;

public class Tomate extends Produto {
    private static final double IMPOSTO = 0.06;
    private String dataValidade;

    public Tomate(String nome, Double valor) {
        super(nome, valor);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate ...");
        return this.valor * IMPOSTO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tomate tomate = (Tomate) o;
        return Objects.equals(dataValidade, tomate.dataValidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataValidade);
    }

    @Override
    public String toString() {
        return "Tomate{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
