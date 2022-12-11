package javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest05 {
    public static void main(String[] args) {
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $
        // . 1.3 = 123, 133, 1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String texto = "teste@hotmail.com, 123aindaumteste@gmail.com, #@!continuaumteste@mail.br";

        System.out.print("Email valido: ");
        System.out.println("continuaumteste@mail.br".matches(regex));
        System.out.println(texto.split(",")[0].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("regex:  " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print("posicao: " + matcher.start() + " valor: " + matcher.group()+"\n");
        }
    }
}
