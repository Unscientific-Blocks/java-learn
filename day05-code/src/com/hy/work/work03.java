package com.hy.work;

import java.util.Random;

public class work03 {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(100);
            arr[i] = r;
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
