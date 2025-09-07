package com.hy.finalExam.topic06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        6.手机选号:根据用户输入的手机号来确认用户实际支付的价格
//        如果尾号为8,需支付办卡费用 50 元
//        如果尾号为4,需支付办卡费用 0 元
//        如果是其他尾号,需支付办卡费用 20 元
        Scanner sc = new Scanner(System.in);
        String phoneNumber = "";
        do {
            System.out.println("请输入手机号:");
            phoneNumber = sc.next();
        } while (!verify(phoneNumber));
        char c = phoneNumber.charAt(phoneNumber.length() - 1);
        if (c == '8') {
            System.out.println("需支付办卡费用 50 元");
        } else if (c == '4') {
            System.out.println("需支付办卡费用 0 元");
        } else {
            System.out.println("需支付办卡费用 20 元");
        }
    }

    public static boolean verify(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            System.out.println("输入错误,手机号长度不对");
            return false;
        }
        if (phoneNumber.charAt(0) != '1') {
            System.out.println("输入错误,手机号第一位要为1");
            return false;
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            char c = phoneNumber.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("输入错误,手机号只能是数字");
                return false;
            }
        }
        return true;
    }
}
