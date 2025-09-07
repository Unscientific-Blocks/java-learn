package com.hy.work;

import java.util.Random;

public class work07 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(6) + 5;
        int arr0[] = new int[r];
        for (int i = 0; i < arr0.length; i++) {
            int x = random.nextInt(100) + 1;
            arr0[i] = x;
        }
        System.out.print("原始数组：");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + " ");
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int i1 = 0;
        int i2 = 0;
        int arr1[] = new int[odd];
        int arr2[] = new int[even];
        for (int i = 0; i < arr0.length; i++) {
            if (arr0[i] % 2 == 1) {
                arr1[i1] = arr0[i];
                i1++;
            } else {
                arr2[i2] = arr0[i];
                i2++;
            }
        }
        System.out.println();
        System.out.print("奇数：");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        System.out.print("偶数：");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for (int i = 0; i < arr0.length; i++) {
            if (i < odd) {
                arr0[i] = arr1[i];
            } else {
                arr0[i] = arr2[i - i1];
            }
        }
        System.out.println();
        System.out.print("处理后的：");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr0[i] + " ");
        }
    }
}
