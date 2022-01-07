package javacore.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());

        System.out.println("\nISO COUNTRIES");

        var isoCountries = Locale.getISOCountries();

        for (String iC : isoCountries) {
            System.out.print(iC+" ");
        }

        System.out.println("\n\nISO LANGUAGES");

        var isoLanguages = Locale.getISOLanguages();

        for (String iL : isoLanguages) {
            System.out.print(iL+" ");
        }
    }
}
