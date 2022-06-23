package javacore.datas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneId);

        LocalDateTime localDateTime = LocalDateTime.now();
        localDateTime.atZone(zoneId);
        System.out.println(localDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println(instant.atZone(zoneId));

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN);

        ZoneOffset manaus = ZoneOffset.of("-04:00");
        System.out.println(manaus);
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.atOffset(manaus));
        System.out.println(OffsetDateTime.of(agora, manaus));
        System.out.println(instant.atOffset(manaus));

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        System.out.println(japaneseDate);

        JapaneseDate meijiEra = JapaneseDate.from(JapaneseDate.of(1900, 2, 1));
        System.out.println(meijiEra);
    }
}
