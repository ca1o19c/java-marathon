package javacore.polimorfismo.dominio;

public class Televisao extends Produto {
    private static final double IMPOSTO = 0.21;

    public Televisao(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão ...");
        return this.valor * IMPOSTO;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
