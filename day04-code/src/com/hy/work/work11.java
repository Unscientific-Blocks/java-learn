package com.hy.work;

import java.util.Scanner;

public class work11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = scanner.nextInt();
        System.out.println("请输入除数：");
        int divisor = scanner.nextInt();
        int result = 0;
        while (dividend > divisor) {
            dividend -= divisor;
            result++;
        }
        System.out.println("商：" + result);
        System.out.println("余：" + dividend);
    }
}
