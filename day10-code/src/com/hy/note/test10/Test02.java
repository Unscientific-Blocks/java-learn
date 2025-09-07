package com.hy.note.test10;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        String n1 = getString(1);
        String n2 = getString(2);
        String sum = "";
        sum += StringToInt(n1) * StringToInt(n2);
        System.out.println(sum);
    }

    private static String getString(int n) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入第" + n + "个字符串:");
            str = sc.nextLine();
            boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    flag = false;
                }
            }
            if (flag) break;
            else System.out.println("输入错误,请输入一个非负整数");
        }
        return str;
    }

    public static int StringToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result *= 10;
            result += str.charAt(i) - '0';
        }
        return result;
    }
}

