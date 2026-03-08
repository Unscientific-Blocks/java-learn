package com.hy.work.topic02;

public class Hashiqi extends Dog{
    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的哈士奇，正在吃骨头，边吃边拆家", this.getName(), this.getAge());
    }
}
