package com.hy.note;

import java.util.Scanner;

public class note02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级：");
        int level = sc.nextInt();
        int price = 1000;

        if (level == 1){
            System.out.println("实际价格：" + (price *= 0.9));
        } else if (level == 2){
            System.out.println("实际价格：" + (price *= 0.8));
        } else if (level == 3){
            System.out.println("实际价格：" + (price *= 0.7));
        } else {
            System.out.println("打骨折");
        }
    }
}
