package com.hy.note;

import java.util.Random;
import java.util.Scanner;

public class note06 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("猜这个数字是多少:");
            int guessNumber = sc.nextInt();
            if (guessNumber > n) {
                System.out.println("猜大了");
            } else if (guessNumber < n) {
                System.out.println("猜小了");
            } else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
