package com.hy.note.test08;

import java.util.Scanner;

public class Test01Case01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str1 = sc.nextLine();
        System.out.println("请输入第二个字符串:");
        String str2 = sc.nextLine();
        if (str1.length() == str2.length()) {
            boolean flag = false;
            for (int i = 0; i < str1.length(); i++) {
                str1 = strChange(str1);
                if (str1.equals(str2)) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }

    public static String strChange(String str1) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if (i == str1.length() - 1) {
                sb.append(str1.charAt(0));
            } else {
                sb.append(str1.charAt(i + 1));
            }
        }
        return sb.toString();
    }
}
