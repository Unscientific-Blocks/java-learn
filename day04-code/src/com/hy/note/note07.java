package com.hy.note;

import java.util.Scanner;

public class note07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int n1 = sc.nextInt();
        System.out.println("请输入第二哥数字");
        int n2 = sc.nextInt();

        int min = 0;
        int max = 0;

        if (n1 > n2) {
            max = n1;
            min = n2;
        } else if (n2 > n1) {
            max = n2;
            min = n1;
        }
        int bei3 = 0;
        int bei5 = 0;

        for (int i = min;i <= max;i++) {
            if (i / 3 != 0 && i % 3 == 0) bei3++;
            if (i / 5 != 0 && i % 5 == 0) bei5++;
        }
        System.out.println("3的倍数有" + bei3 + "个");
        System.out.println("5的倍数有" + bei5 + "个");
    }
}
