package com.hy.work.topic03;

public class Test01 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个,
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候（还没吃），发现只剩下一个桃子了，
        请问，最初总共多少个桃子？
         */

        int num = 1;
        for (int i = 0; i < 9; i++) {
            num = (num + 1) * 2;
        }
        System.out.println(num);

        //f(10) = 1;
        //f(9) = (f(10) + 1) * 2
        //f(8) = (f(9) + 1) * 2
        //...
        //f(1) = (f(2) + 1) * 2

        System.out.println(getNum(1));
    }

    public static int getNum(int num) {
        if (num <= 0 || num >= 11) {
            System.out.println("当前时间错误");
            return -1;
        }
        if (num == 10) return 1;
        return (getNum(num + 1) + 1) * 2;
    }
}
