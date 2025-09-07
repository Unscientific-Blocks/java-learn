package com.hy.note;

import java.util.Scanner;

public class note01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        double price = sc.nextDouble();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("请输入头等舱或经济舱(0为经济舱,1为头等舱):");
        int c = sc.nextInt();
        if((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            //淡季
            price = getPrice(c, price, 0.65, 0.7);
        } else if (month >= 5 && month <= 10) {
            //旺季
            price = getPrice(c, price, 0.85, 0.9);
        } else {
            System.out.println("输入的月份不合法");
        }
        System.out.println(price);
    }

    private static double getPrice(int c, double price, double price1, double price2) {
        if (c == 0) {
            price *= price1;
        } else if (c == 1) {
            price *= price2;
        } else {
            System.out.println("不存在这种舱位");
        }
        return price;
    }
}
