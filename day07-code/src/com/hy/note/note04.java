package com.hy.note;

public class note04 {
    public static void main(String[] args) {
        int[] arr0 = {1,2,3,4,5,7,8,9};
        int[] arr1 = new int[arr0.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr0[i];
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}
