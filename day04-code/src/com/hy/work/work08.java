package com.hy.work;

import java.util.Scanner;

public class work08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = scanner.nextInt();
        int max = number2 > number1 ? number2 : number1;
        int min = number2 < number1 ? number2 : number1;
        int count = 0;
        for (int i = 0; i < max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
