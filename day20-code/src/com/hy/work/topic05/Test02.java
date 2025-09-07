package com.hy.work.topic05;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test02 {
    public static void main(String[] args) {
        //判断任意的一个年份是闰年还是平年
        //要求：用JDK7和JDK8两种方式判断
        //提示:
        //二月有29天是闰年
        //一年有366天是闰年

        //JDK8
        String year = "2004";
        LocalDate startDate = LocalDate.of(Integer.parseInt(year), 1, 1);
        LocalDate endDate = LocalDate.of(Integer.parseInt(year) + 1, 1, 1);
        int day = (int) ChronoUnit.DAYS.between(startDate, endDate);
        if (day == 365) {
            System.out.println("平年");
        } else if (day == 366) {
            System.out.println("闰年");
        }
    }
}
