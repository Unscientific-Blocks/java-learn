package com.hy.finalExam.topic03;

public class Test01 {
    public static void main(String[] args) {
        int n = 10;
        int count = 1;
        for (int i = 0; i < 1000; i++) {
            if (i == n) {
                n *= 10;
                count++;
            }
            int temp = i;
            int result = 0;
            for (int j = 0; j < count; j++) {
                int x = 1;
                for (int k = 0; k < count; k++) {
                    x *= temp % 10;
                }
                result += x;
                temp /= 10;
            }
            if (result == i) {
                System.out.println(result);
            }
        }
    }
}
