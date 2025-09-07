package com.hy.note;

import java.util.Scanner;

public class note05_2 {
    public static void main(String[] args) {
        int socres[] = getScores();
        int max = getMax(socres);
        int min = getMin(socres);
        int sum = getSum(socres);
        int socre = (sum - max - min) / (socres.length - 2);
        System.out.println("最后的得分为:" + socre);
    }

    public static int[] getScores() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("输入的成绩有误,请重新输入");
            }
        }
        return arr;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) max = max > arr[i] ? max : arr[i];
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) min = min < arr[i] ? min : arr[i];
        return min;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) sum += arr[i];
        return sum;
    }
}
