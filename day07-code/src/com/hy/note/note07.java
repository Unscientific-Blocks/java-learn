package com.hy.note;

import java.util.Random;

public class note07 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = {2,588,888,1000,10000};
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length;) {
            int randomIndex = random.nextInt(arr.length);
            if (flag(newArr, arr[randomIndex])) {
                newArr[i] = arr[randomIndex];
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
    public static boolean flag(int[] arr, int temp) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == temp) {
                return false;
            }
        }
        return true;
    }
}
