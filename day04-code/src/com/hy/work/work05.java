package com.hy.work;

import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入工资：");
        double money = scanner.nextDouble();
//        记录扣除三险一金后的工资
        double temp = money * 0.9;
//        计算应交所得税的部分
        double shuibu = temp - 5000;
        double shui = 0;
        if (shuibu < 0) {
            shui = 0;
            money = temp - shui;
        } else if (shuibu > 0 && shuibu <= 3000) {
            shui = shuibu * 0.03;
            money = temp - shui;
        } else if (shuibu > 3000 && shuibu <= 12000) {
            shui = (shuibu - 3000) * 0.1 + 3000 * 0.03;
            money = temp - shui;
        } else if (shuibu > 12000 && shuibu <= 25000) {
            shui = (shuibu - 12000) * 0.2 + 3000 * 0.03 + (12000 - 3000) * 0.1;
            money = temp - shui;
        } else if (shuibu > 25000 && shuibu <= 35000) {
            shui = (shuibu - 25000) * 0.25 + 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2;
            money = temp - shui;
        } else if (shuibu > 35000 && shuibu <= 55000) {
            shui = (shuibu - 35000) * 0.3 + 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25;
            money = temp - shui;
        } else if (shuibu > 55000 && shuibu <= 80000) {
            shui = (shuibu - 55000) * 0.35 + 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3;
            money = temp - shui;
        } else if (shuibu > 80000) {
            shui = (shuibu - 80000) * 0.45 + 3000 * 0.03 + (12000 - 3000) * 0.1 + (25000 - 12000) * 0.2 + (35000 - 25000) * 0.25 + (55000 - 35000) * 0.3 + (80000 - 55000) * 0.35;
            money = temp - shui;
        }
        System.out.println(money);
        System.out.println(shui);
    }
}
