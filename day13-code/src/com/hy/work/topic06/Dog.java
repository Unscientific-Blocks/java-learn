package com.hy.work.topic06;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为" + this.getColor() + "的" + this.getAge() + "岁的狗在吃" + something);
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }
}
