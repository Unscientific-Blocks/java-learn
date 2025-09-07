package com.hy.note.test04;

import java.time.ZoneId;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()    获取Java中支持的所有时区
        static ZoneId systemDefault()               获取系统默认时区
        static ZoneId of(String zoneId)             获取一个指定时区
         */

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds.size());
        System.out.println(availableZoneIds);

        ZoneId zoneId1 = ZoneId.systemDefault();
        System.out.println(zoneId1);

        ZoneId zoneId2 = ZoneId.of("America/Marigotr");
        System.out.println(zoneId2);
    }
}
