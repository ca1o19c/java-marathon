package javacore.strings.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Caio"; // String constant pool
        String nome2 = "Caio";

        nome = nome.concat(" Antonio");

        System.out.println(nome == nome2); // compara a referência do objeto
        System.out.println(nome.equals(nome2)); // compara o valor da variável

        String nome3 = new String("Caio"); // Cria um objeto do tipo string e também aloca no pool de strings
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
        System.out.println(nome2.equals(nome3));

    }
}
