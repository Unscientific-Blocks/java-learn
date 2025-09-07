package com.hy.work.topic02;

public class Test01 {
    public static void main(String[] args) {
        //自己实现parselnt方法的效果，将字符串形式的数据转成整数。
        //要求:
        //      字符串中只能是数字不能有其他字符
        //      最少一位，最多10位
        //      0不能开头
        long i = parseInt("9999999999");
        System.out.println(i);
    }

    public static long parseInt(String str) {
        String regex = "[1-9]\\d{0,9}";
        if (!str.matches(regex)) {
            return -1;
        }
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            result = result * 10 + str.charAt(i) - '0';
        }
        return result;
    }
}
