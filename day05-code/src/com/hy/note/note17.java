package com.hy.note;

import java.util.Random;

public class note17 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Random random = new Random();
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
