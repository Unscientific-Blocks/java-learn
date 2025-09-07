package com.hy.homework;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr =new int[6];
        arr[0] = 60;
        arr[1] = 63;
        arr[2] = 82;
        arr[3] = 88;
        arr[4] = 99;
        arr[5] = 0;
        System.out.println("请输入学员的成绩:");
        int n = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (n > arr[i] && n <= arr[i + 1]) {
                index = i + 1;
            }
        }
        if (n < arr[0]) {
            index = 0;
        }
        if (n > arr[arr.length - 2]) {
            index = arr.length - 1;
        }
        for (int i = arr.length - 1; i > index; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        arr[index] = n;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
