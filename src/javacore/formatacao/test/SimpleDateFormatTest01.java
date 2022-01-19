package javacore.formatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String mascara = "yyyy.MM.dd G 'para' HH:mm:ss z";
        String mascaraAmsterdam = "'Amsterdam' dd 'de' MMMM 'de' YYYY";

        SimpleDateFormat sdf = new SimpleDateFormat(mascara);
        SimpleDateFormat sdf2 = new SimpleDateFormat(mascaraAmsterdam);

        System.out.println(sdf.format(new Date()));
        System.out.println(sdf2.format(new Date()));

        try {
            System.out.println(sdf2.parse("Amsterdam 19 de janeiro de 2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
