package com.hy.note;

import java.util.Scanner;

public class note03 {
    public static void main(String[] args) {
//switch 语句格式
//switch(表达式) {
//    caes 值1：
//        语句体1
//        break;
//    caes 值2：
//        语句体2
//        break;
//
//    ......
//
//    default 值1：
//        语句体n + 1
//        break;
// }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天的星期数：");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("动感单车");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("好好吃一顿");
                break;
            default:
                System.out.println("输入了错误的数字");
                break;

        }
    }
}
