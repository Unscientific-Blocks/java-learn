package com.hy.note.test04;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test02 {
    public static void main(String[] args) {
        /*
        static Instant now()                        获取当前时间的Instant对象（标准时间）
        static Instant ofXxx(long epochMilli)      根据（秒/毫秒/纳秒）获取Instant对象
        ZonedDateTime atZone(ZoneId zone)           指定时区
        boolean isXxx(Instant otherInstant)         判断系列的方法
        Instant minusXxx(long millisToSubtract)     减少时间系列的方法
        Instant plusXxx(long millisToSubtract)      增加时间系列的方法
         */

        //Instant now = Instant.now();
        //System.out.println(now);

        Instant instant1 = Instant.ofEpochMilli(0L);
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);
        System.out.println(instant3);

        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);

        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        System.out.println(instant4.isBefore(instant5));
        System.out.println(instant4.isAfter(instant5));
        System.out.println("===============================");
        
        Instant instant6 = Instant.ofEpochMilli(5000L);
        System.out.println(instant6);
        Instant instant7 = instant6.plusSeconds(3600L);
        System.out.println(instant7);
    }
}
