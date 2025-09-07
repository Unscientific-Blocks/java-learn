package com.hy.note;

import java.util.Scanner;

public class note04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
//            default:
//                System.out.println("没有这个数字");
        }

        switch (n){
            case 4 ->{
                System.out.println("四");
            }
            case 5 ->{
                System.out.println("五");
            }
            case 6 ->{
                System.out.println("六");
            }
//            default -> {
//                System.out.println("没有这个数字");
//            }
        }



        switch (n) {
            case 7 -> System.out.println("七");
            case 8 -> System.out.println("八");
            case 9 -> System.out.println("九");
            default -> System.out.println("没有这个数字");
        }




    }
}
