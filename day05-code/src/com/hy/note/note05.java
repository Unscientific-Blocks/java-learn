package com.hy.note;

import java.util.Random;

public class note05 {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int n = r.nextInt(10) + 1;
            System.out.println(n);
        }

    }
}
