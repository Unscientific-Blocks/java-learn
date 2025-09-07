package com.hy.note;

import java.util.Scanner;

public class note06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一位数字：");
        int n = sc.nextInt();
        if (n >= 0 && n <= 10){
            switch (n) {
                case 1 -> System.out.println("机票查询");
                case 2 -> System.out.println("机票预订");
                case 3 -> System.out.println("机票改签");
                default -> System.out.println("退出服务");
            }
        } else {
            System.out.println("输入了错误的数字");
        }
    }
}
