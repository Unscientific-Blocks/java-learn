package com.hy.note;

public class note14 {
    public static void main(String[] args) {
        int arr[] = {33,5,22,44,55};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
        }
        System.out.println(max);
    }
}
