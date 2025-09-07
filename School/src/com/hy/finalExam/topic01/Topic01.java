package com.hy.finalExam.topic01;

import java.util.Scanner;

public class Topic01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height;
        double weight;
        while (true) {
            System.out.println("请输入身高(单位 m):");
            height = sc.nextDouble();
            System.out.println("请输入体重(单位 kg):");
            weight = sc.nextDouble();
            if (height < 0 || weight < 0) {
                System.out.println("数据错误,请重新输入");
            } else break;
        }
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi >= 18.5 && bmi < 23) {
            System.out.println("正常");
        } else if (bmi >= 23 && bmi < 25) {
            System.out.println("偏胖");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("肥胖");
        } else if (bmi >= 30 && bmi < 40) {
            System.out.println("重度肥胖");
        } else if (bmi >= 40) {
            System.out.println("极度肥胖");
        }
    }
}
