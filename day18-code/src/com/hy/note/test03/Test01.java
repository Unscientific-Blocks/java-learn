package com.hy.note.test03;

public class Test01 {
    public static void main(String[] args) {
        /*
        System
        public static void exit(int status)     终止当前运行的Java虚拟机
        public static long currentTimeMillis()  返回当前系统的时间毫秒值形式
        public static void arraycopy(数据源数组，起始索引，目的地数组，起始索引，拷贝个数）    数组拷贝
         */

        //System.exit(0);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            if (isPrime1(i)) {
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static boolean isPrime1 (int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrime2 (int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
