package com.hy.finalExam.topic03;

import java.util.Scanner;

public class Topic02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字:");
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        temp = n;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int result = 1;
            for (int j = 0; j < count; j++) {
                result *= temp % 10;
            }
            sum += result;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println(n + "是水仙花数");
        } else {
            System.out.println(n + "不是水仙花数");
        }
    }
}
