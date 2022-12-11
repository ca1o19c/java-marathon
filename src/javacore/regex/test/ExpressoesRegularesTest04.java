package javacore.regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTest04 {
    public static void main(String[] args) {
        // ? Zero ou uma
        // * Zero ou mais
        // + Uma ou mais
        // {n,m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";

        Pattern pattern = Pattern.compile(regex);
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto:  " + texto);
        System.out.println("regex:  " + regex);
        System.out.println("posicoes encontradas");

        while (matcher.find()) {
            System.out.print("posicao: " + matcher.start() + " valor: " + matcher.group()+"\n");
        }
    }
}
