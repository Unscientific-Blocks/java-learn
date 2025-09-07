package com.hy.work;

public class work13 {
    public static void main(String[] args) {
        for (int year = 1988;year < 2019;year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            }
        }
    }
}
