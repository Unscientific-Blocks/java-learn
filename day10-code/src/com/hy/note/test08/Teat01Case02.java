package com.hy.note.test08;

import java.util.Scanner;

public class Teat01Case02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str1 = sc.nextLine();
        System.out.println("请输入第二个字符串:");
        String str2 = sc.nextLine();
        System.out.println(isEquals(str1, str2));
    }

    private static String isEquals(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        for (int i = 0; i < str1.length(); i++) {
            if (sb.append(str1).toString().substring(i, i + str1.length()).equals(str2)) {
                return "true";
            }
        }
        return "false";
    }
}
