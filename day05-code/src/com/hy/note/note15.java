package com.hy.note;

import java.util.Random;

public class note15 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(99) + 1;
            arr[i] = r;
            System.out.println(arr[i]);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        int average = sum / arr.length;
        System.out.println(average);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        System.out.println(count);
    }
}
