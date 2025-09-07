package com.hy.note;

import java.util.Scanner;

public class note09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
//        判断数字的位数
        int wei = 1;
        int i = n;
        while (i > 9) {
            i /= 10;
            wei++;
        }
//        System.out.println(wei);
        int sum = 0;
        int j = n;
        int t = wei;
        while (t > 0) {
            int a = j % 10;
//            System.out.println(a);
            for (int b = t - 1;b > 0;b--) {
                a *= 10;
            }
            sum += a;
            j /= 10;
            t--;
        }
//        System.out.println(sum);
        System.out.println(n == sum);
    }
}
