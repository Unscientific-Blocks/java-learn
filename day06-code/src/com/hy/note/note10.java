package com.hy.note;

public class note10 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int[] newarr = copyOfRange(arr,3,7);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr, int from, int to) {
        int arr1[] = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            arr1[index] = arr[i];
            index++;
        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i] + " ");
//        }
        return arr1;
    }
}
