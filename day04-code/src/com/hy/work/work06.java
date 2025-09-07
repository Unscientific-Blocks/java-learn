package com.hy.work;

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int n = sc.nextInt();
        int result = 0;
        switch (n) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = a / b;
            default -> System.out.println("输入了错误的运算");
        }
        System.out.println(result);
    }
}
