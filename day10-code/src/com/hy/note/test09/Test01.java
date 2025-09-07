package com.hy.note.test09;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int index = new Random().nextInt(arr.length);
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        String newStr = new String(arr);
        System.out.println(newStr);
    }
}
