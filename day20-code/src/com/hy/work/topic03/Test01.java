package com.hy.work.topic03;

public class Test01 {
    public static void main(String[] args) {
        //定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        int num = 256;
        String str = toBinaryString(num);
        System.out.println(str);

    }

    public static String toBinaryString(int num) {
        StringBuilder str = new StringBuilder();
        while (num > 0) {
            str.insert(0, num % 2);
            num /= 2;
        }
        return str.toString();
    }
}
