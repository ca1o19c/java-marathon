package javacore.formatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        var localeThailandia = new Locale("th", "TH");
        var localeCanada = Locale.CANADA;
        var localeItalia = Locale.ITALY;

        var nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(localeItalia);
        nfa[2] = NumberFormat.getInstance(localeThailandia);
        nfa[3] = NumberFormat.getInstance(localeCanada);

        double valor = 100_000_000.2130;

        for (NumberFormat numberFormat: nfa
             ) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
