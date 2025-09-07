package com.hy.note.test05;

public class Test04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 8, 0};
        System.out.println(getArrString(arr));
    }
    public static String getArrString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.append(arr[arr.length - 1]).append("]");
        return sb.toString();
    }
}
