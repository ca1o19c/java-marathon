package javacore.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {

        LocalDate agora = LocalDate.now();

        agora = agora.plusDays(20);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = agora.withDayOfMonth(20);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = agora.with(ChronoField.DAY_OF_MONTH, 30);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.SATURDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());
    }
}
