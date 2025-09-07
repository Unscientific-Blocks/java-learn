package com.hy.work;

import java.util.Scanner;

public class work07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = scanner.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = scanner.nextInt();
        int max = number1 > number2 ? number1 : number2;
        int min = number1 < number2 ? number1 : number2;
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
