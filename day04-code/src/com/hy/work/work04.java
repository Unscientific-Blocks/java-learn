package com.hy.work;

import java.util.Scanner;

public class work04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户类别（0表示普通顾客，1表示会员）：");
        int vip = sc.nextInt();
        System.out.println("请输入用户购物的折前金额：");
        double money = sc.nextInt();
        if (vip == 0) {
            if (money >= 100) {
                money *= 0.9;
                System.out.println("应付金额：" + money);
            } else if (money >= 0 && money < 100) {
                System.out.println("应付金额：" + money);
            } else {
                System.out.println("超市倒欠你钱了？");
            }
        } else if (vip == 1) {
            if (money >= 200) {
                money *= 0.75;
                System.out.println("应付金额：" + money);
            } else if (money >= 0 && money < 200) {
                money *= 0.9;
                System.out.println("应付金额：" + money);
            } else {
                System.out.println("超市倒欠你钱了？");
            }
        } else {
            System.out.println("请输入正确的用户类别");
        }
    }
}
