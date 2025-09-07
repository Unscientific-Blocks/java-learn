package com.hy.work;

public class work04 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 3, 5, 4};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }
        System.out.println(result);
    }
}
