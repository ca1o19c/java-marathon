package javacore.datas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();

        Date data = calendario.getTime();

        System.out.println(data);

        if (calendario.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingão é o primeiro dia da semana");
        }

        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        calendario.add(Calendar.DAY_OF_MONTH, 3);
        calendario.add(Calendar.HOUR, 6);

        data = calendario.getTime();

        System.out.println(data);
    }
}
