package com.hy.note.test04;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.println("请输入数字(不超过7位):");
            n = sc.nextInt();
            if (n < 10000000 && n >= 0) {
                break;
            } else {
                System.out.println("输入错误");
            }
        }
        int[] nArr = new int[7];
        for (int i = nArr.length - 1; i >= 0; i--) {
            nArr[i] = n % 10;
            n /= 10;
        }
        char[] bigNumber = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        char[] unit = {'佰', '拾', '万', '仟', '佰', '拾', '元'};
        String result = "";
        for (int i = 0; i < nArr.length; i++) {
            result += bigNumber[nArr[i]];
            result += unit[i];
        }
        System.out.println(result);
    }
}
