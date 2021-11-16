package javacore.polimorfismo.dominio;

public class Computador extends Produto {
    private static final double IMPOSTO = 0.21;

    public Computador(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do computador ...");
        return this.valor * IMPOSTO;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
