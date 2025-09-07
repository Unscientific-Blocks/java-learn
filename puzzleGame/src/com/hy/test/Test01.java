package com.hy.test;

import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;
        }
        int weigh = 4;
        int height = 4;
        int[][] arr = new int[weigh][height];
        for (int i = 0; i < tempArr.length; i++) {
            arr[i / 4][i % 4] = tempArr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
