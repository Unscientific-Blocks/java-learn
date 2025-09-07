package com.hy.work;

public class Topic01 {
    public static void main(String[] args) {
        double fu = 177;
        double mu = 165;
        double s = (fu + mu) * 1.08 / 2;
        double d = (fu * 0.932 + mu) / 2;
        System.out.println("儿子的身高：" + s + "cm");
        System.out.println("女儿的身高：" + d + "cm");
    }
}
