package com.hy.note;

import java.util.Scanner;

public class note06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要被加密的数字");
        int n = sc.nextInt();
        int[] bit = getBit(n);
        int[] newBit = encryption(bit);
        int m = 0;
        for (int i = 0; i < newBit.length; i++) {
            System.out.print(newBit[i]);
            m = m * 10 + newBit[i];
        }
        System.out.println();
        System.out.println(m);
    }
    
//      把n的每一位数字存入数组
    public static int[] getBit(int n) {
        int temp = n;
        int count = 0;
        int i = 1;
        while (temp != 0) {
            temp /= 10;
            count++;
            i++;
        }
        int[] bit = new int[count];
        for (int j = bit.length - 1, k = 1; j >= 0; j--) {
            bit[j] = (n / k) % 10;
            k *= 10;
        }
        return bit;
    }
    
    
    public static int[] encryption(int[] bit) {
        int[] newBit = new int[bit.length];
        for (int i = 0; i < bit.length; i++) {
            newBit[i] = (bit[bit.length - 1 - i] + 5) % 10;
        }
        return newBit;
    }
}
