package com.hy.work;

public class work01 {
    public static void main(String[] args) {
        double n1 = 590.31;
        double n2 = 403.32;
        double min = getMin(n1,n2);
        System.out.println(min);
    }
    public static double getMin(double a, double b) {
        double min = a < b ? a : b;
        return min;
    }
}
