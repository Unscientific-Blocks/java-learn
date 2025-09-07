package com.hy.work;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = sc.nextInt();
        System.out.println("数字" + n + "是" + getBit(n) + "位数");
    }
    public static int getBit(int n){
        int count = 0;
        for (int i = 1; n != 0; i++) {
            n /= 10;
            count++;
        }
        return count;
    }
}
