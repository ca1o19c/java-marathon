package javacore.excecoes.exception.test;

import javacore.excecoes.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {

        var teclado = new Scanner(System.in);

        String userNameDB = "Goku";
        String senhaDB = "ssj";

        System.out.println("Usuário");
        var userNameIn = teclado.nextLine();

        System.out.println("Senha");
        var senhaIn = teclado.nextLine();

        if (!userNameDB.equals(userNameIn) || !senhaDB.equals(senhaIn)) {
            throw new LoginInvalidoException("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
