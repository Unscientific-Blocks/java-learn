package com.hy.finalExam.topic10;

public class orderTakeout {
    public static void main(String[] args) {
//        某小伙想定一份外卖，商家的优惠方式如下:
//          鱼香肉丝单点24元，
//          油炸花生米单点8元，
//          米饭单点3元。
//        订单满30元8折优惠。鱼香肉丝优惠价 16 元，
//        但是优惠价和折扣不能同时使用。
//        那么这个小伙要点这三样东西，最少要花多少钱?
        double fish = 24;
        double peanut = 8;
        double rice = 3;
        //不使用优惠和折扣
        double price1 = fish + peanut + rice;

        //使用优惠不使用折扣
        double discountFish = 16;
        double price2 = discountFish + peanut + rice;

        //使用折扣不使用优惠
        double price3 = price1;
        if (price1 >= 30) {
            price3 = price1 * 0.8;
        }

        double min = price1 > price2 ? price2 : price1;
        min = min > price3 ? price3 : min;
        System.out.println("最少要花" + min + "元");
    }
}
