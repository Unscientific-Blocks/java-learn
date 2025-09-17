package com.hy.work.topic01;

public class PersianCat extends Cat {
    public PersianCat() {
    }

    public PersianCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的波斯猫，正在吃小饼干", this.getName(), this.getAge());
        System.out.println();
    }
}
