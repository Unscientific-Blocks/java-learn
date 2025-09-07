package com.hy.finalExam.work;

import java.util.Scanner;

public class outputWeek {
    public static String[] week = {"一", "二", "三" , "四", "五", "六", "日"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        loop: while (true) {
            System.out.println("请输入数字 1 - 7 :");
            day = sc.next();
            switch (day) {
                case "1", "2", "3", "4", "5", "6", "7": {
                    System.out.println("今天是星期" + week[day.charAt(0) - '1']);
                    break loop;
                }
                default: {
                    System.out.println("输入错误，请重新输入");
                }
            }
        }
    }
}
