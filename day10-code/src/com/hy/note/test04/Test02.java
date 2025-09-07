package com.hy.note.test04;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        char[] uppercase = new char[26];
        char[] lowercase = new char[26];
        char[] number = new char[10];
        for (int i = 0; i < uppercase.length; i++) {
            uppercase[i] = (char)(65 + i);
            lowercase[i] = (char)(97 + i);
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = (char)(48 + i);
        }

        int sumUppercase = 0;
        int sumLowercase = 0;
        int sumNumber = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int i1 = 0; i1 < uppercase.length; i1++) {
                if (str.charAt(i) == uppercase[i1]) {
                    sumUppercase++;
                    break;
                }
            }
            for (int i1 = 0; i1 < lowercase.length; i1++) {
                if (str.charAt(i) == lowercase[i1]) {
                    sumLowercase++;
                    break;
                }
            }
            for (int i1 = 0; i1 < number.length; i1++) {
                if (str.charAt(i) == number[i1]) {
                    sumNumber++;
                    break;
                }
            }
        }
        System.out.println("大写字母有" + sumUppercase + "个");
        System.out.println("小写字母有" + sumLowercase + "个");
        System.out.println("数字有" + sumNumber + "个");
    }
}
