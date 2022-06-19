package javacore.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek diaDaSemana = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int adicionaDia;

        switch (diaDaSemana) {
            case THURSDAY:
                adicionaDia = 4;
                break;
            case FRIDAY:
                adicionaDia = 3;
                break;
            case SATURDAY:
                adicionaDia = 2;
                break;
            default:
                adicionaDia = 1;
                break;
        }

        return temporal.plus(adicionaDia, ChronoUnit.DAYS);
    }
}

public class TemporalAdjustersTest02 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now().with(new ObterProximoDiaUtil());

        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());
    }
}
