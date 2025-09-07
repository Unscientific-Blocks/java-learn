package com.hy.note;

public class note01 {
    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            跳过第三次循环
//            if (i == 2){
//                continue;
//            }
//            System.out.println("第" + (i + 1) + "次循环");
//        }
//
//        for无限循环
//        for (;;){
//            System.out.println("hello");
//        }
//
//        while无限循环
//        while (true){
//            System.out.println("world");
//        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("第" + i + "次循环");
        }


    }
}
