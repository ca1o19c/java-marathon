package javacore.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localItalia = new Locale("it", "IT");
        Locale localSuica = new Locale("it", "CH");
        Locale localBrasil = new Locale("pt", "BR");
        Locale localIndia = new Locale("hi", "IN");
        Locale localTailandia = new Locale("th", "TH");
        Locale localJapao = new Locale("ja", "JP");
        Locale localHolanda = new Locale("nl", "NL");

        Calendar calendario = Calendar.getInstance();

        var df1 = DateFormat.getDateInstance(DateFormat.FULL, localItalia);
        var df2 = DateFormat.getDateInstance(DateFormat.FULL, localSuica);
        var df3 = DateFormat.getDateInstance(DateFormat.FULL, localBrasil);
        var df4 = DateFormat.getDateInstance(DateFormat.FULL, localIndia);
        var df5 = DateFormat.getDateInstance(DateFormat.FULL, localTailandia);
        var df6 = DateFormat.getDateInstance(DateFormat.FULL, localJapao);
        var df7 = DateFormat.getDateInstance(DateFormat.FULL, localHolanda);

        System.out.println("Italia: " + df1.format(calendario.getTime()) +
                "\nSuiça: " + df2.format(calendario.getTime()) +
                "\nBrasil: " + df3.format(calendario.getTime()) +
                "\nIndia: " + df4.format(calendario.getTime()) +
                "\nTailândia: " + df5.format(calendario.getTime()) +
                "\nJapão: " + df6.format(calendario.getTime()) +
                "\nHolanda: " + df7.format(calendario.getTime()));

        Locale localEua = new Locale("us", "NY");

        System.out.println("\nItalia: " + localItalia.getDisplayCountry(localEua) +
                "\nSuiça: " + localSuica.getDisplayCountry(localEua) +
                "\nBrasil: " + localBrasil.getDisplayCountry(localEua) +
                "\nIndia: " + localIndia.getDisplayCountry(localEua) +
                "\nTailândia: " + localTailandia.getDisplayCountry(localEua) +
                "\nJapão: " + localJapao.getDisplayCountry(localEua) +
                "\nHolanda: " + localHolanda.getDisplayCountry(localEua));
    }
}
