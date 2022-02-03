package javacore.datas.test;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        var agora = LocalDateTime.now();
        var doisAnos = LocalDateTime.now().plusYears(2).plusMinutes(8);

        var tempoAgora = LocalTime.now();
        var seteHoras = LocalTime.now().minusHours(7);

        var d1 = Duration.between(agora, doisAnos);
        var d2 = Duration.between(tempoAgora, seteHoras);
        var d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        var d4 = Duration.ofDays(20);
        var d5 = Duration.ofMinutes(3);
        var d6 = Duration.of(3, ChronoUnit.HOURS);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
    }
}
