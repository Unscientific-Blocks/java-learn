package com.hy.work;

import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr1[] = {12,14,23,45,66,68,70,77,90,91};
        int arr2[] = new int[11];
        System.out.println("请输入一个整数数字：");
        int n = sc.nextInt();
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (n > arr1[i]) {
                arr2[i] = arr1[i];
            } else if (n < arr1[i]) {
                arr2[i + 1] = arr1[i];
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0) arr2[i] = n;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
