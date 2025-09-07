package com.hy.note.test13;

public class Outer {
    int a = 10;
    static int b = 20;

    static class Inner{
        public void show1() {
            System.out.println("show1");
            System.out.println("a");
            System.out.println("b");
        }

        public static void show2() {
            System.out.println("show2");
            System.out.println("a");
            System.out.println("b");
        }
    }
}
