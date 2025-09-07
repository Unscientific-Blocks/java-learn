package com.hy.note.test06;

import java.math.BigInteger;

public class Test01 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num, Random rnd)      获取随机大整数，范围：[0 ～ 2的num次方-1]
            public BigInteger(String val)               获取指定的大整数
            public BigInteger(String val, int radix)    获取指定进制的大整数

            public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
                细节：
                对象一旦创建里面的数据不能发生改变。
        */

        //1. 获取一个随机的大整数
        /*
        Random r = new Random();
        BigInteger bi1 = new BigInteger(10, r);
        System.out.println(bi1);
         */


        //2. 获取一个指定的大整数
        //细节:字符串中必须是整数
        BigInteger bi2 = new BigInteger("-9999999999999999999");
        System.out.println(bi2);

        //3.获取指定进制的大整数
        //细节：
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写和1，写其他的就报错。
        BigInteger bi3 = new BigInteger("0110", 8);
        System.out.println(bi3);


        //4. 静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字：-16～16进行了优化。
        //  提前把-16～16先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        /*
        BigInteger bd5 = BigInteger.value0f(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.print1n(bd5 == bd6);//true
        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//false
        */

        //5. 对象一旦创建里面的数据不能发生改变。
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9.add(bd10);
        System.out.println(bd9.add(bd10));
    }
}
