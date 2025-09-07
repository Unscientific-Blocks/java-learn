package com.hy.note.test01;

public class Test01 {
    public static void main(String[] args) {
        /*
            public static int abs(int a)获取参数绝对值
            public static double ceil(double a)向上取整
            public static double floor(double a)向下取整
            public static int round(float a)四舍五入
            public static int max(int a,int b)获取两个int值中的较大值
            public static double pow(double a,double b)返回a的b次幂的值
            public static double    sqrt(double a)返回a的平方根
            public static double    cbrt（double a)返回a的立方根
            public static double random()返回值为double的随机值，范围[0.0,1.0)
         */

        //public static int abs(int a)获取参数绝对值
        //System.out.println(Math.abs(10));
        //System.out.println(Math.abs(-134));
        //System.out.println(Math.abs(-2147483648));
        //System.out.println(Math.abs(-2147483647));


        //System.out.println(Math.ceil(13.1354));
        //System.out.println(Math.ceil(-19.4));

        //public static int round(float a)四舍五入
        //System.out.println(Math.round(12.34));//12
        //System.out.println(Math.round(12.49));//12
        //System.out.println(Math.round(12.50));//13
        //System.out.println(Math.round(12.54));//13

        //System.out.println(Math.max(20, 30));
        //System.out.println(Math.min(20, 30));

        System.out.println(Math.pow(4, 5));
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(4, -2));
        System.out.println(Math.pow(4, -2.5));

        System.out.println("---------------");

        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
