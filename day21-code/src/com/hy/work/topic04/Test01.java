package com.hy.work.topic04;

public class Test01 {
    public static void main(String[] args) {
        /*
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢？

        运算结果：
            1层台阶1种爬法
            2层台阶2种爬法
            7层台阶21种爬法

        f(100) = f(99) + f(98)
        f(99) = f(98) + f(97)
        f(3) = f(2) + f(1)
        f(2) = 2
        f(1) = 1

         */

        System.out.println(getCount(20));

    }

    public static int getCount(int num) {
        if (num <= 0) {
            System.out.println("输入错误");
            return -1;
        }
        if (num == 1) return 1;
        if (num == 2) return 2;
        return getCount(num - 1) + getCount(num - 2);
    }
}
