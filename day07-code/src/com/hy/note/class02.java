package com.hy.note;

import java.util.Scanner;

public class class02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数(1-7):");
        int n = sc.nextInt();
        if (n > 0 && n <= 7){
            switch (n) {
                case 1, 3, 5 -> System.out.println("吃红烧鱼");
                case 2, 4, 6 -> System.out.println("红烧猪脚");
                case 7 -> System.out.println("吃水煮青菜");
            }
        } else {
            System.out.println("请输入正确的数字");
        }
    }
}
