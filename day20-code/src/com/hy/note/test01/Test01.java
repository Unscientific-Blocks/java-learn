package com.hy.note.test01;

import java.util.Date;

public class Test01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);

        Date d2 = new Date(1756989000000L);
        System.out.println(d2);

        d2.setTime(10000L);
        System.out.println(d2);

        long t1 = d1.getTime();
        System.out.println(t1);

        long t2 = d1.getTime();
        System.out.println(t2);
    }
}
