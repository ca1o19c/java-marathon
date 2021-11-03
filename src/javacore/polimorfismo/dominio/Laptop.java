package javacore.polimorfismo.dominio;

public class Laptop extends Produto{
    private static final double IMPOSTO = 0.61;

    public Laptop(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do laptop ...");
        return this.valor * IMPOSTO;
    }
}
