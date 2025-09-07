package com.hy.note.test01;

import java.util.Date;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
        //需求1：打印时间原点开始一年之后的时间
        //需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        Date d1 = new Date();
        setYear(d1, 3);

        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        System.out.println(d2);
        System.out.println(d3);
        long t2 = d2.getTime();
        long t3 = d3.getTime();
        System.out.println(t2 > t3 ? d2 : d3);
    }

    private static void setYear(Date d1, int year) {
        d1.setTime(0L);
        long t1 = d1.getTime();
        for (int i = 0; i < year; i++) {
            t1 += 1000L * 3600 * 24 * 365;
        }
        d1.setTime(t1);
        //System.out.println(d1);
    }
}
