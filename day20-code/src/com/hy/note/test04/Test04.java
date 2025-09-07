package com.hy.note.test04;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test04 {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf.format(time));
    }
}
