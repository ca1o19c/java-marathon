package javacore.classesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected Double salario;

    protected Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract void calculaBonus();
}
