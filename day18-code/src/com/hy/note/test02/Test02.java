package com.hy.note.test02;

public class Test02 {
    public static void main(String[] args) {
        int num = 99999;
        int count = 0;
        for (int i = 10000; i < num; i++) {
            int temp = i;
            int pow = 0;
            double sum = 0;
            while (temp != 0) {
                temp /= 10;
                pow++;
            }
            temp = i;
            for (int j = 0; j < pow; j++) {
                sum += Math.pow(temp % 10, pow);
                temp /= 10;
            }
            if (sum == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        System.out.println("end");
    }

}
