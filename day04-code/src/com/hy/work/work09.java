package com.hy.work;

public class work09 {
    public static void main(String[] args) {
        double i = 0.1;
        int count = 0;
        while (i < 8844430) {
            count++;
            i *= 2;
            System.out.println(i);
        }
        System.out.println(count);
    }
}
