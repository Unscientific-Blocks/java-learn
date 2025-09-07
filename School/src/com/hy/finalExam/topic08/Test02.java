package com.hy.finalExam.topic08;

public class Test02 {
    public static void main(String[] args) {
//        打印 100 以内除了尾数为 3,5,7 的所有数
        for (int i = 0; i < 100; i++) {
            int end = i % 10;
            if (end != 3 && end != 5 && end != 7) {
                System.out.println(i);
            }
        }
    }
}
