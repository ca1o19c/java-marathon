package javacore.heranca.dominio;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    private BigDecimal salario;

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
