package com.hy.note.test04;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        String newStr = reversal(str);
        System.out.println(newStr);
    }

    public static String reversal(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(str.length() - 1 - i);
        }
        return newStr;
    }
}
