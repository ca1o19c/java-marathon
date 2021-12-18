package javacore.excecoes.exception.test;

import javacore.excecoes.exception.dominio.Funcionario;
import javacore.excecoes.exception.dominio.LoginInvalidoException;
import javacore.excecoes.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        var pessoa = new Pessoa();

        var funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
