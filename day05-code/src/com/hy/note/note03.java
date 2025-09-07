package com.hy.note;

import java.util.Scanner;

public class note03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数:");
        int x =sc.nextInt();
        if (x >= 2) {
            for (int i = 0 ; i <= x; i++) {
                if (i * i > x) {
                    System.out.println(i--);
                    break;
                }
            }
        } else {
            System.out.println("请输入正确的数字");
        }
    }
}
