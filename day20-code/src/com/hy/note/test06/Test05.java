package com.hy.note.test06;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();
        int i = Integer.parseInt(line);
        System.out.println(i + 1);
    }
}
