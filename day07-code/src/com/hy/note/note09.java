package com.hy.note;

import java.util.Random;
import java.util.Scanner;

public class note09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入会员号4位数");
        int n = sc.nextInt();
        int x = random.nextInt(10);
        if (n /100 % 10 == x) {
            System.out.println("恭喜获得幸运大奖");
        } else {
            System.out.println("谢谢惠顾");
        }
        System.out.println("幸运数字是" + x);
    }
}
