package com.hy.note.test09;

public class InterImpl implements Inter {

    @Override
    public void method() {
        System.out.println("InterImpl重写的抽象方法");
        boolean f = false;
    }
}
