package com.hy.note;

public class note02 {
    public static void main(String[] args) {
        for (int i = 101; i <= 200; i++) {
            boolean n = true;
            for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    n = false;
                    break;
                }
            }
            if (n) System.out.println(i);
        }
    }
}
