package com.hy.note;

public class note12 {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        arr[0] = new int[]{22, 66, 44};
        arr[1] = new int[]{77, 33, 88};
        arr[2] = new int[]{25, 45, 65};
        arr[3] = new int[]{11, 66, 99};
        int sumAll = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(i + ":" + sum);
            sumAll += sum;
        }
        System.out.println(sumAll);
    }
}
