package javacore.introducaometodos.test;

import javacore.introducaometodos.dominio.Funcionario;

public class FuncionarioTest {

    public static final Double[] SALARIOS = {1200.0, 987.32, 2000.0};
    public static final int IDADE = 32;
    public static final String NOME = "John Doe";

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome(NOME);
        funcionario.setIdade(IDADE);
        funcionario.setSalarios(SALARIOS);

        funcionario.imprimiRelatorio();
        System.out.println(funcionario.getMedia());
    }
}
