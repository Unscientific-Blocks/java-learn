package com.hy.work;

import java.util.Random;

public class work07_2 {
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
        int arr1[] = new int[r];
        int left = 0, right = arr1.length - 1;
        for (int i = 0; i < arr1.length; i++) {
            if (arr0[i] % 2 == 1) {
                arr1[left] = arr0[i];
                left++;
            } else {
                arr1[right] = arr0[i];
                right--;
            }
        }
        System.out.println();
        System.out.print("处理后的：");
        for (int i = 0; i < arr0.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
