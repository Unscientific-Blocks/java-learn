package com.hy.note;

public class ArrUtil {
    public static void printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
}
