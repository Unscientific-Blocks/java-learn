package com.hy.note.test02;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {60, 63, 82, 88, 89};
        System.out.println("请输入学员的成绩:");
        int n = sc.nextInt();
        int[] newArr = new int[arr.length + 1];
        boolean flag = true;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (n < arr[i] && flag) {
                flag = false;
                index = i;
                newArr[i] = n;
            } else if (flag){
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        newArr[newArr.length - 1] = n < arr[arr.length - 1] ? arr[arr.length - 1] : n;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
