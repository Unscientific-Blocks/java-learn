package com.hy.work.topic02;

public class LihuaCat extends Cat {

    @Override
    public void eat() {
        System.out.printf("一只叫做%s的，%s岁的狸花猫，正在吃鱼", this.getName(), this.getAge());
    }
}
