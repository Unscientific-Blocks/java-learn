package com.hy.note;

import java.util.Scanner;

public class class01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的百米赛跑的成绩:");
        double score = sc.nextDouble();
        if (score < 10) {
            System.out.println("请输入你的性别:");
            String sex = sc.next();
            if (sex.equals("男")) {
                System.out.println("男子组决赛");
            } else {
                System.out.println("女子组决赛");
            }
        } else {
            System.out.println("没有进入决赛");
        }
    }
}
