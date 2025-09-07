package com.hy.finalExam.topic05;

import java.util.Scanner;

public class Test {
    private static final double ONE = 0.0225;
    private static final double TWO = 0.027;
    private static final double THREE = 0.0325;
    private static final double FOUR = 0.0;
    private static final double FIVE = 0.036;
    private static final double[] interest = {ONE, TWO, THREE, FOUR, FIVE};

    public static void main(String[] args) {
//        5.某银行推出了整存整取定期储蓄业务,
//        其存期分为一年、两年、三年、五年,
//        到期凭存单支取本息，存款年利率表如下
//        存款年利率表如下:存期 年利率(%)
//        一年    2.25
//        两年    2.7
//        三年    3.25
//        五年    3.6
//        请存入一定金额(1000 起存)，存一定年限(四选一)，计算到期后得到的本息总额。
//        提示:
//          存入金额和存入年限均由键盘录入
//          本息计算方式:本金+本金X年利率x年限
        Scanner sc = new Scanner(System.in);
        double principal;
        while (true) {
            System.out.println("请输入存入金额:");
            principal = sc.nextDouble();
            System.out.println("请输入存入年限:");
            String year = sc.next();
            if (principal < 1000) {
                System.out.println("1000起存");
                System.out.println("请重新输入");
            } else {
                if (year.equals("1") || year.equals("2") || year.equals("3") || year.equals("5")) {
                    int n = year.charAt(0) - '0';
                    principal += principal * interest[n - 1] * n;
                    break;
                } else {
                    System.out.println("存入年限错误");
                    System.out.println("请重新输入");
                }
            }
        }
        System.out.println("本息总额为:" + principal);



    }
}
