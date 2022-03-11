package javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate doisAnos = LocalDate.now().plusYears(2).plusDays(7);

        Period p1 = Period.between(agora, doisAnos);
        System.out.println(p1);

        Period p2 = Period.ofDays(10);
        System.out.println(p2);

        Period p3 = Period.ofWeeks(58);
        System.out.println(p3);

        Period p4 = Period.ofMonths(3);
        System.out.println(p4);

        Period p5 = Period.ofYears(3);
        System.out.println(p5);

        System.out.println(Period.between(LocalDate.now(),
                LocalDate.now().plusDays(p3.getDays())).getMonths());

        System.out.println(agora.until(agora.plusDays(p3.getDays()), ChronoUnit.DAYS));
    }
}
