package com.hy.work;

public class work07 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int value = 7;
        int[] arrNew = fill(arr,value);
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
    public static int[] fill(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
