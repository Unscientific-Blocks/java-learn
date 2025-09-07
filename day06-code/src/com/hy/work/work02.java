package com.hy.work;

public class work02 {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int max = getMax(a, b, c);
        System.out.println(max);
    }
    public static int getMax(int num1, int num2, int num3) {
        int max = num1;
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else if (num3 >= num1 && num3 >= num2) {
            max = num3;
        }
        return max;
    }
}
