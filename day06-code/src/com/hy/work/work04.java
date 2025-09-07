package com.hy.work;

public class work04 {
    public static void main(String[] args) {
        double a = -280.34;
        double abs = getAbsolute(a);
        System.out.println(a + " " + abs);
    }
    public static double getAbsolute(double n) {
        double absolute;
        if (n >= 0) {
            absolute = n;
        } else {
            absolute = -1 * n;
        }
        return absolute;
    }
}
