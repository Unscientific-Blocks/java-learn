package com.hy.finalExam.topic02;

public class Test01 {
    public static void main(String[] args) {
//        小蓝同学想买一个价值 8888元的新手机
//        她的旧手机在二手市场能卖 1880元
//        而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打 7.5 折优惠。
//        为了更省钱，小蓝要不要以旧换新?
        double newPrice = 8888;
        double oldPrice = 1888;
        double price01 = newPrice - oldPrice;//不要以旧换新
        double price02 = newPrice * 0.75;//要以旧换新
        if (price01 < price02) {
            System.out.println("不要以旧换新");
        } else {
            System.out.println("要以旧换新");
        }
    }
}
