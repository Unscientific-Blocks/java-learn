package com.hy.note.test02;

public class Test01 {
    public static void main(String[] args) {
         //二分查找


        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        //7, 23, 79, 81, 103, 127, 131, 147
        System.out.println(twoPointSearch(arr, 3));

    }

    public static int twoPointSearch(int[] arr, int target) {
        int[] arrSort = sort(arr);
        int min = 0;
        int max = arrSort.length - 1;
        int mid = (max + min) / 2;
        while (min <= max) {
            if (target == arrSort[mid]) {
                return mid;
            } else if (target > arrSort[mid]) {
                min = mid + 1;
                mid = (max + min) / 2;
            } else if (target < arrSort[mid]) {
                max = mid - 1;
                mid = (max + min) / 2;
            }
        }
        return -1;
    }

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
