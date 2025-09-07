package com.hy.note.test05;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.nextLine();
        if (new StringBuilder(str).reverse().toString().equals(str)) System.out.println("是");
        else System.out.println("不是");
    }
}
