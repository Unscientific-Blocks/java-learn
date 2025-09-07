package com.hy.note.test08;

public class InterImpl1 implements Inter {
    @Override
    public void method() {
        System.out.println("实现类重写的抽象方法");
    }

    @Override
    public void show1() {
        System.out.println("重写接口中的默认方法");
    }
}
