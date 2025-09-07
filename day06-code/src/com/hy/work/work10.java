package com.hy.work;

public class work10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newArr = copyOfRange(arr,0,8);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from, int to) {
        int[] newArr = new int[to-from];
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
    }
}
