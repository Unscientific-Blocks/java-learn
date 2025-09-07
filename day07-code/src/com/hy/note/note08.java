package com.hy.note;

import java.util.Random;
import java.util.Scanner;

public class note08 {
    public static void main(String[] args) {
        int[] num = getNumber();
        int blue = num[num.length - 1];
        System.out.println("你选择的号码为:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + "\t");
        }
        int[] winNum = getWinNum();
        int winBlue = winNum[winNum.length - 1];
        System.out.println();
        System.out.println("中奖号码为:");
        for (int i = 0; i < winNum.length; i++) {
            System.out.print(winNum[i] + "\t");
        }

        int marchRed = getMarchRed(num, winNum);
        boolean isBlueWin = blue == winBlue;
        int prize = prize(marchRed, isBlueWin);
        System.out.println();
        if (prize == 0) {
            System.out.println("没有中奖");
        } else {
            System.out.println("中奖了,奖金为" + prize + "元");
        }
    }

    public static int[] getNumber() {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[7];
        for (int i = 0; i < num.length - 1;) {
            System.out.println("请输入第" + (i + 1) + "个红球的号码:");
            int x = sc.nextInt();
            if (x >= 1 && x <= 33 && flag(num, x)) {
                num[i] = x;
                i++;
            } else if (!flag(num, x)) {
                System.out.println(x + "已被选过,请重新输入");
            } else {
                System.out.println("输入的数字超出范围,请输入1-33内的数字");
            }
        }
        while (num[num.length - 1] == 0) {
            System.out.println("请输入蓝球的号码");
            int x = sc.nextInt();
            if (x >= 1 && x <= 16) {
                num[num.length - 1] = x;
            } else {
                System.out.println("输入的数字超出范围,请输入1-16内的数字");
            }
        }
        return num;
    }

    public static boolean flag(int[] num, int x) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                return false;
            }
        }
        return true;
    }

    public static int[] getWinNum() {
        int[] winNum = new int[7];
        Random random = new Random();
        for (int i = 0; i < winNum.length - 1;) {
            int x = random.nextInt(33) + 1;
            if (flag(winNum, x)) {
                winNum[i] = x;
                i++;
            }
        }
        int x = random.nextInt(16) + 1;
        winNum[winNum.length - 1] = x;
        return winNum;
    }

    public static int getMarchRed(int[] num, int[] winNum) {
        int count = 0;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < winNum.length - 1; j++) {
                if (num[i] == winNum[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int prize(int marchRed,boolean isBlueWin) {
        int prize = 0;
        if (!(isBlueWin)) {
            switch (marchRed) {
                case 0,1,2,3 -> prize = 0;
                case 4 -> prize = 10;
                case 5 -> prize = 200;
                case 6 -> prize = 5000000;
            }
        } else {
            switch (marchRed) {
                case 0,1,2 -> prize = 5;
                case 3 -> prize = 10;
                case 4 -> prize = 200;
                case 5 -> prize = 3000;
                case 6 -> prize = 10000000;
            }
        }
        return prize;
    }
}
