package com.hy.finalExam.topic04;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        4.接收用户输入的3个整数,并将它们的最大值作为结果输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int num3 = sc.nextInt();
        int max = 0;
        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num2 && num3 > num1) {
            max = num2;
        }
        System.out.println(max);
    }
}
