package com.hy.work.topic05;

public class Test01 {
    public static void main(String[] args) {
         /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？

        f(20) = f(19) + f(18) + f(17)
        f(4) = f(3) + f(2) + f(1)
        f(3) = 4
        f(2) = 2
        f(1) = 1
         */

        System.out.println(getCount(20));
    }

    public static int getCount(int n) {
        if (n <= 0) return -1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        return getCount(n - 1) + getCount(n - 2) + getCount(n - 3);
    }
}
