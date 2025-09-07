package com.hy.note;

import java.util.Scanner;

public class note06_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要被解密的数字");
        int n = sc.nextInt();
        int[] bit = getBit(n);
        int[] result = decrypt(bit);
        int m = getResult(result);
        System.out.println(m);
    }
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
    public static int[] decrypt(int[] bit) {
        for (int i = 0, j = bit.length - 1; i < j; i++, j--) {
            int temp = bit[i];
            bit[i] = bit[j];
            bit[j] = temp;
        }
        for (int i = 0; i < bit.length; i++) {
            if (bit[i] <= 4) {
                bit[i] += 10;
            }
        }
        for (int i = 0; i < bit.length; i++) {
            bit[i] -= 5;
        }
        return bit;
    }
    public  static int getResult(int[] result) {
        int m = 0;
        for (int i = 0; i < result.length; i++) {
            m = m * 10 + result[i];
        }
        return m;
    }
}
