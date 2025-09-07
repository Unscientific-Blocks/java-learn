package com.hy.note.test06;

public class Test01 {
    public static void main(String[] args) {
        Integer i1 = new Integer(10);
        Integer i2 = new Integer("10");
        System.out.println(i1);
        System.out.println(i2);

        Integer i3 = Integer.valueOf(20);
        Integer i4 = Integer.valueOf("20");
        Integer i5 = Integer.valueOf("20", 8);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
        System.out.println("====================");

        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i8 == i9);

        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11);

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12 == i13);
    }
}
