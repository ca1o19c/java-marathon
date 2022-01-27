package javacore.datas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        var localDateTime = LocalDateTime.now();
        var localDate = LocalDate.parse("2022-08-06");
        var localTime = LocalTime.parse("09:45:00");

        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        var ldt1 = localDate.atTime(localTime);
        System.out.println(ldt1);

        var ldt2 = localTime.atDate(localDate);
        System.out.println(ldt2);
    }
}
