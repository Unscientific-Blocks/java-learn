package com.hy.work.topic01;

public class HuskyDog extends Dog {
    public HuskyDog() {
    }

    public HuskyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的哈士奇，正在吃骨头，边吃边拆家", this.getName(), this.getAge());
        System.out.println();
    }
}
