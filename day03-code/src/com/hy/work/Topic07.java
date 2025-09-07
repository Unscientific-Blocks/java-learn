package com.hy.work;

import java.util.Scanner;

public class Topic07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一位三位整数：");
        int n = sc.nextInt();

        int n1 = n % 10;
        int n2 = n / 10 % 10;
        int n3 = n / 100 % 10;

        int sum = n1 + n2 + n3;
        System.out.println("每位数字的和为：" + sum);
    }
}
