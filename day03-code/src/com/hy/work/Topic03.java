package com.hy.work;

public class Topic03 {
    public static void main(String[] args) {
        int yu = 24;
        int hua = 8;
        int mi = 3;
        int money = yu + hua + mi;
        double money1 = money > 30 ? money * 0.8 : money;
        double money2 = 16 + hua + mi;
        double money3 = money1 < money2 ? money1 : money2;
        System.out.println("最少要花" + money + "元");

    }
}
