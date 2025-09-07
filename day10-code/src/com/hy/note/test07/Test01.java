package com.hy.note.test07;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        String str = getString();
//        Ⅰ Ⅱ Ⅲ Ⅳ Ⅴ Ⅵ Ⅶ Ⅷ Ⅸ Ⅹ
        System.out.println(changeNumber(str));
    }

    private static String getString() {
        Scanner sc = new Scanner(System.in);
        String str = "";
        while (true) {
            System.out.println("请输入一个字符串:");
            str = sc.nextLine();
            if (str.length() <= 9) {
                boolean flag = true;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                       flag = false;
                    }
                }
                if (flag) {
                    return str;
                } else {
                    System.out.println("字符串里只能是数字");
                }
            } else {
                System.out.println("字符串长度要小于等于9");
            }
        }
    }

    public static String changeNumber(String str) {
        String [] arr ={" ","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(arr[str.charAt(i)-'0']);
        }
        return sb.toString();
    }
}
