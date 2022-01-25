package javacore.datas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        var tempo = LocalTime.of(23, 32, 12);
        var tempoAgora = LocalTime.now();

        System.out.println(tempo);
        System.out.println(tempoAgora);

        System.out.println(tempoAgora.getHour());
        System.out.println(tempoAgora.getMinute());
        System.out.println(tempoAgora.getSecond());
        System.out.println(tempoAgora.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }
}
