package javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest02 {
    public static void main(String[] args) {
        // Meta caracteres
        // \d = Todos os dígitos
        // \D = Tudo que não for dígitos
        // \s = Espaços em branco (no java os espaços em brancos são representados por \t \n \l e \r)
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-ZA-Z, dígitos, _
        // \W = Tudo que não for incluso no \w

        String regex = "\\W";
        String texto = "@#hh_j2 12gvh21";

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
