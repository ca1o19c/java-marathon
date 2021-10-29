package javacore.heranca.dominio;

import java.math.BigDecimal;
import java.util.Objects;

public class Funcionario extends Pessoa {
    static {
        System.out.println("dentro do bloco de inicialização estático funcionario");
    }

    private BigDecimal salario;

    {
        System.out.println("dentro do bloco  de inicialização não estático funcionario 1");

    }

    {
        System.out.println("dentro do bloco  de inicialização não estático funcionario 2");

    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor funcionario");
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento() {
        System.out.println("Eu " + this.nome + ", declaro que recebi o slário de " + this.salario);
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(salario, that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                '}';
    }
}
