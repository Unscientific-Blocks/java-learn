package com.hy.work;

import java.util.Random;

public class work11_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = {2,588,888,1000,10000};
        int[] brr = new int[arr.length];
        int index = 0;
        while (index < arr.length) {
            int i = random.nextInt(arr.length);
            if (exsit(brr, arr, i)) {
                continue;
            } else {
                brr[index] = arr[i];
                System.out.println(brr[index]);
                index++;
            }
        }
    }
    public static boolean exsit(int[] brr, int [] arr, int n) {
        for (int i = 0; i < brr.length; i++) {
            if (brr[i] == arr[n]) {
                return true;
            }
        }
        return false;
    }
}
