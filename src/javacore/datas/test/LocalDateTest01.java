package javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2022, Month.JANUARY, 20);

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.isLeapYear());
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

        System.out.println(localDate);

        LocalDate agora = LocalDate.now();

        System.out.println(agora);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }
}
