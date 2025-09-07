package com.hy.work.topic8;

public class Test01 {
    public static void main(String[] args) {
        String s = "Java语言是面向对象的，Java语言是健壮的，Java语言是安全的，Java是高性能的，Java语言是跨平台的JavaJavaJavaJavaJavaJavaJavaJava";
        String str = "Java";
        int count = 0;
        while (true) {
            if (s.indexOf(str) == -1) {
                break;
            }
            count++;
            s = s.substring(s.indexOf(str) + str.length());
        }
        System.out.println(count);
    }
}
