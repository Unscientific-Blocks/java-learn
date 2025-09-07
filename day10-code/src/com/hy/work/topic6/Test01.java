package com.hy.work.topic6;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        我国的居民身份证号码，由由十七位数字本体码和一位数字校验码组成。
//        请定义方法判断用户输入的身份证号码是否合法，并在主方法中调用方法测试结果。
//        规则为：号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身份证号码:");
        String id = scanner.nextLine();
        System.out.println(check(id));
    }

    public static boolean check(String id) {
        if (id.length() != 18) {
            System.out.println("id.length() != 18");
            return false;
        }
        if (id.charAt(0) == '0') {
            return false;
        }
        for (int i = 0; i < id.length() - 1; i++) {
            if (id.charAt(i) < '0' || id.charAt(i) > '9') {
                System.out.println("id.charAt(i) < 0 || > 9" + " - " + i);
                return false;
            }
        }
        if ((id.charAt(id.length() - 1) >= '0' && id.charAt(id.length() - 1) <= '9') || id.charAt(id.length() - 1) == 'X') {
            return true;
        } else {
            System.out.println("id.charAt(0) < 0 || > 9 || != X");
            return false;
        }
    }
}
