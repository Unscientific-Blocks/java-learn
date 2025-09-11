package com.hy.work.topic02;

public class Test01 {
    public static void main(String[] args) {
        /*有一个很有名的数学逻辑题叫做不死神兔问题，
        有一对兔子，从出生后第三个月起每个月都生一对兔子，
        小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第十二个月的兔子对数为多少？
            1月：1
            2月：1
            3月：2
            4月：3
            5月：5
            6月：8
         特点：从第三个数据开始，是前两个数据和（斐波那契数列）
         */

        //方法一: 循环
        int[] rabbitsArr = new int[12];
        rabbitsArr[0] = 1;
        rabbitsArr[1] = 1;
        /*for (int i = 2; i < rabbitsArr.length; i++) {
            rabbitsArr[i] = rabbitsArr[i - 2] + rabbitsArr[i - 1];
        }
        System.out.println(Arrays.toString(rabbitsArr));*/

        //方法二: 递归
        //1.递归出口
        //2.找规律
        //f(12) = f(11) + f(10)
        //f(11) = f(10) + f(9)
        //...
        //f(3) = f(2) + f(1)
        //f(2) = 1
        //f(1) = 1
        System.out.println(getRabbitNumber(12));
    }

    private static int getRabbitNumber(int num) {
        if (num == 1) return 1;
        if (num == 2) return 1;
        return getRabbitNumber(num - 1) + getRabbitNumber(num - 2);
    }
}
