package javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        String s1 = data.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = data.format(DateTimeFormatter.ISO_DATE);
        String s3 = data.format(DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20220805", DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(parse1);

        LocalDateTime agora = LocalDateTime.now();

        String s4 = agora.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(s4);

        LocalDateTime parse = LocalDateTime.parse("2022-08-05T21:05:28.681775");

        System.out.println(parse);

        DateTimeFormatter formatacaoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(LocalDate.now().format(formatacaoBr));

        DateTimeFormatter formatacaoGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        System.out.println(LocalDate.now().format(formatacaoGR));
    }
}
