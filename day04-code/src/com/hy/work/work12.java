package com.hy.work;

public class work12 {
    public static void main(String[] args) {
        int x = 2019 % 12;
        for (int i = 2019;i >= 1949;i--) {
            if (i % 12 == x) {
                System.out.println(i);
            }
        }
    }
}
