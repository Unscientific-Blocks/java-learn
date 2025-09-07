package com.hy.note;

public class note09 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        printArr(arr);
        int i = getMax(arr);
        System.out.println(i);
        boolean e = ifExist(arr, 44);
        System.out.println(e);
    }
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean ifExist(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }
}
