package javacore.datas;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date data = new Date(1_000_000_000_000L); // Long milissegundos

        System.out.println(data);

        data.setTime(1_640_801_516_408L);

        System.out.println(data);

        data.setTime(data.getTime() + 3_600_000_000L);

        System.out.println(data);
    }
}
