package javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        var localeThailandia = new Locale("th", "TH");
        var localeCanada = Locale.CANADA;
        var localeItalia = Locale.ITALY;

        var nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance();
        nfa[1] = NumberFormat.getCurrencyInstance(localeItalia);
        nfa[2] = NumberFormat.getCurrencyInstance(localeThailandia);
        nfa[3] = NumberFormat.getCurrencyInstance(localeCanada);

        double valor = 1_000.2130;

        for (NumberFormat numberFormat: nfa
             ) {
            System.out.println(numberFormat.format(valor));
        }

        try {
            System.out.println(nfa[3].parse("$1,000.21"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
