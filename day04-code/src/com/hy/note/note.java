package com.hy.note;

public class note {
    public static void main(String[] args) {
//       for循环
//       格式
//      for(初始化语句;条件判断语句;条件控制语句) {
//      循环体语句;
//      }
//
//
//
//
//
//
//
//        for (int i = 1;i <= 5;i++) {
//            System.out.println(i);
//        }
//        for (int i = 5;i >= 1;i--) {
//            System.out.println(i);
//        }
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//            System.out.println(sum);
//        }


        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
    }
}
