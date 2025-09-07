package com.hy.note.test08;

public class InterImpl3 implements Inter1,Inter {
    @Override
    public void method() {
        System.out.println("重写的 Inter1 中的抽象方法");
    }

    @Override
    public void show1() {
        System.out.println("重写的show1方法");
    }

    @Override
    public void show2() {
        System.out.println("重写的show2方法");
    }


}
