package com.hy.note.test04;

public class Test02 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
