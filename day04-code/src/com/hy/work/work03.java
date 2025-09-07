package com.hy.work;

import java.util.Scanner;

public class work03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存款金额：");
        double ben = sc.nextInt();
        System.out.println("请输入存入年限：");
        int m = sc.nextInt();
        if (ben >= 1000) {
            switch (m){
                case 1 :{
                    for (int n = m;n > 0;n--) {
                        ben *= 1.025;
                    }
                    System.out.println(ben);
                    break;
                }
                case 2 :{
                    for (int n = m;n > 0;n--) {
                        ben *= 1.027;
                    }
                    System.out.println(ben);
                    break;
                }
                case 3 :{
                    for (int n = m;n > 0;n--) {
                        ben *= 1.0325;
                    }
                    System.out.println(ben);
                    break;
                }
                case 5 :{
                    for (int n = m;n > 0;n--) {
                        ben *= 1.036;
                    }
                    System.out.println(ben);
                    break;
                }
                default :{
                    System.out.println("不能存这些年");
                }
            }
        } else {
            System.out.println("这些钱存不了");
        }
    }
}
