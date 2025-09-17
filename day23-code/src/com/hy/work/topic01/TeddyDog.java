package com.hy.work.topic01;

public class TeddyDog extends Dog {
    public TeddyDog() {
    }

    public TeddyDog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的泰迪，正在吃骨头，边吃边蹭", this.getName(), this.getAge());
        System.out.println();
    }
}
