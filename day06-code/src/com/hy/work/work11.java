package com.hy.work;

import java.util.Random;

public class work11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = {2,588,888,1000,10000};
        for (int i = 0; i < arr.length; i++) {
            int n = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
