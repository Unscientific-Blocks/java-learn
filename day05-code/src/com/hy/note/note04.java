package com.hy.note;

import java.util.Scanner;

public class note04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int x = sc.nextInt();
        boolean zhishu = true;
        for (int i = 2;i < x;i++) {
            if (x % i == 0) {
                zhishu = false;
            }
        }
        System.out.println(zhishu);
    }
}
