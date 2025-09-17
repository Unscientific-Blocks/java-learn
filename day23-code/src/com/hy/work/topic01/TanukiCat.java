package com.hy.work.topic01;

public class TanukiCat extends Cat {
    public TanukiCat() {
    }

    public TanukiCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的狸花猫，正在吃鱼", this.getName(), this.getAge());
        System.out.println();
    }
}
