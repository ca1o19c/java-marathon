package javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest03 {
    public static void main(String[] args) {
        // Meta caracteres
        // [] = Range de caracteres

        String regex = "[a-zA-C]";
        String texto = "cafeBABE";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex:  " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print("posicao: " + matcher.start() + " valor: " + matcher.group()+"\n");
        }
    }
}
