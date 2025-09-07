package com.hy.note;

import java.util.Scanner;

public class note01 {
    public static void main(String[] args) {
//        if的第一种格式
//        if(关系表达式){
//            语句体；
//        }
//        if的第二种格式
//        if(关系表达式){
//            语句体1；
//        } else {
//            语句体2；
//        }
//
//
//
//
//
//
//
//
//
//
//

        Scanner sc = new Scanner(System.in);
        System.out.println("输入女婿的酒量：");
        int liquor = sc.nextInt();

        if (liquor > 2) {
            System.out.println("小伙子，不错哟");
        }


    }
}
