package com.hy.work;

public class work08 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arrNew = fill(arr,0,6,10);
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i >= fromIndex && i < toIndex) {
                arrNew[i] = value;
            } else {
                arrNew[i] = arr[i];
            }
        }
        return arrNew;
    }
}
