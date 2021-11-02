package javacore.classesabstratas.dominio;

public class Gerente extends Funcionario {
    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario * 1.05;
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo ...");
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
