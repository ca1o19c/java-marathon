package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "John Doe";
        funcionario.idade = 32;
        funcionario.salarios = new Double[]{1200.0, 987.32, 2000.0};

        funcionario.imprimiRelatorio();
    }
}
