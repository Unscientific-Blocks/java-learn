package com.hy.note;

import java.util.Scanner;

public class note11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int x = sc.nextInt();
        int sum = 0;
        int temp = x;

        while (x != 0) {
            int ge = x % 10;
            x = x / 10;
            sum = sum * 10 + ge;
        }
        System.out.println(sum == temp);

    }
}
