package com.hy.work;

import java.util.Scanner;

public class work10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = scanner.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0){
            sum = sum * 10 + n % 10;
            n = n / 10;
        }
        System.out.println(sum == temp);
        }
}
