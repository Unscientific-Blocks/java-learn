package com.hy.note;

import java.util.Scanner;

public class note05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[6];
        System.out.println("请输入第一位评委打出的分数:");
        arr[0] = sc.nextInt();
        System.out.println("请输入第二位评委打出的分数:");
        arr[1] = sc.nextInt();
        System.out.println("请输入第三位评委打出的分数:");
        arr[2] = sc.nextInt();
        System.out.println("请输入第四位评委打出的分数:");
        arr[3] = sc.nextInt();
        System.out.println("请输入第五位评委打出的分数:");
        arr[4] = sc.nextInt();
        System.out.println("请输入第六位评委打出的分数:");
        arr[5] = sc.nextInt();
        double max = arr[0], min = arr[0], sum = 0;
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 100 || arr[i] < 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < 6; i++) max = arr[i] > max ? arr[i] : max;
            for (int i = 0; i < 6; i++) min = arr[i] < min ? arr[i] : min;
            for (int i = 0; i < arr.length; i++) sum += arr[i];
            double avg = (sum - max - min) / 4;
            System.out.println(avg);
        } else {
            System.out.println("输入的分数错误");
        }

    }
}
