package com.hy.note;

import java.util.Random;

public class note03 {
    public static void main(String[] args) {
        Random random = new Random();
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i <= 25) {
                chars[i] = (char)(97 + i);
            } else {
                chars[i] = (char)(65 + i - 26);
            }
        }
        String result = "";
        for (int i = 0; i < 4; i++) {
            int r = random.nextInt(chars.length);
            result += chars[r];
        }
        int r = random.nextInt(9);
        result += r;
        System.out.println(result);
    }
}
