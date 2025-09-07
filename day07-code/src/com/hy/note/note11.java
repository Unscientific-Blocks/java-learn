package com.hy.note;

public class note11 {
    public static void main(String[] args) {
//        利用动态初始化创建二维数组
        int[][] arr = new int[3][5];
        arr[2][4] = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
