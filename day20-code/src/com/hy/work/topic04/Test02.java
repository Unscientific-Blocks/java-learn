package com.hy.work.topic04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Test02 {
    public static void main(String[] args) {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK8
        LocalDate now = LocalDate.now();
        LocalDate bir = LocalDate.of(2006, 1, 23);
        long day = ChronoUnit.DAYS.between(bir, now);
        System.out.println(day);
    }
}
