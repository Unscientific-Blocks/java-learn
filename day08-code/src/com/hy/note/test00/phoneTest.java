package com.hy.note.test00;

public class phoneTest  {
    public static void main(String[] args) {
//        创建手机的对象
        phone mi = new phone();

//        给手机赋值
        mi.brand = "小米";
        mi.price = 1999.98;

//        获取手机对象的值
        System.out.println(mi.brand);
        System.out.println(mi.price);

//        调用手机中的方法
        mi.call();
        mi.playGame();
    }
}
