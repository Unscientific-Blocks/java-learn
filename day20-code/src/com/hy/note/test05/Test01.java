package com.hy.note.test05;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class Test01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println("今天的日期: " + now);

        LocalDate ld1 = LocalDate.of(2025, 2, 10);
        System.out.println("指定的日期: " + ld1);

        int year = now.getYear();
        System.out.println("Year: " + year);

        Month m = now.getMonth();
        System.out.println(m);
        System.out.println("Month: " + m.getValue());

        System.out.println(now.getMonthValue());
        System.out.println("=======================");

        LocalDate withLd = now.withYear(2016);
        System.out.println(withLd);

        LocalDate localDate1 = now.minusYears(2);
        System.out.println(localDate1);

        LocalDate birDate = LocalDate.of(2006,9,5);
        MonthDay birMd = MonthDay.from(birDate);
        MonthDay nowMd = MonthDay.of(now.getMonth(), now.getDayOfMonth());
        if (nowMd.equals(birMd)) {
            System.out.println("今天是生日");
        } else {
            System.out.println("今天不是生日");
        }

    }
}
