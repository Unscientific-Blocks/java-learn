package com.hy.ui;

import java.util.Random;

public class CodeUtil {
    public static String getCode() {
        Random r = new Random();
        char[] code = new char[5];
        int number = r.nextInt(3) + 1;// 1 - 3
        int uppercase = r.nextInt(5 - number - 1) + 1;// 2 - 4
        int lowercase = 5 - number - uppercase;
        for (int i = 0; i < number; i++) {
            code[i] = (char) ('0' + r.nextInt(10));
        }
        for (int i = 0; i < uppercase; i++) {
            code[i + number] = (char) ('A' + r.nextInt(26));
        }
        for (int i = 0; i < lowercase; i++) {
            code[i + number + uppercase] = (char) ('a' + r.nextInt(26));
        }
        for (int i = 0; i < code.length; i++) {
            int index = r.nextInt(code.length);
            char temp = code[i];
            code[i] = code[index];
            code[index] = temp;
        }
        return new String(code);
    }
}
