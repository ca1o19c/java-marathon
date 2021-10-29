package javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ditgite seu nome ");
        var nome = entrada.nextLine();

        System.out.print("Digite sua idade ");
        var idade = entrada.nextInt();

        System.out.print("Digite seu gênero M ou F ");
        var sexo = entrada.next().charAt(0);

        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nGênero " + sexo);
    }
}
