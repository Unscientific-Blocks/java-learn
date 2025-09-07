package com.hy.note.test03;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "admin";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名:");
            String userNameIn = sc.next();
            System.out.println("请输入密码:");
            String passwordIn = sc.next();
            if (userNameIn.equals(userName) && passwordIn.equals(password)) {
                System.out.println("登录成功");
                break;
            } else if (userNameIn.equals(userName)) {
                System.out.println("密码错误");
            } else if (passwordIn.equals(password)) {
                System.out.println("用户名错误");
            } else {
                System.out.println("用户名和密码错误");
            }
            if (i != 2) {
                System.out.println("还剩下" + (2 - i) + "次机会,请重新输入");
            } else {
                System.out.println("您已连续3次输入错误,禁止输入");
            }
        }
    }
}
