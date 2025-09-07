package com.hy.note.test04;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        String str = ToString(arr);
        System.out.println(str);
    }
    public static String ToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }

        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i] + "]";
            } else {
                str += arr[i] + ", ";
            }
        }
        return str;
    }
}
