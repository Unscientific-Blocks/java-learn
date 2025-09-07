package com.hy.work;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个整数:");
        int num3 = sc.nextInt();
        print(num1, num2, num3);
    }
    public static void print(int a, int b, int c) {
        int max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        int min = a < b ? (a < c ? a : c) : (b < c ? b : c);
        int mid = a + b + c - max - min;
        System.out.println(max + " " + mid + " " + min);
    }
}
