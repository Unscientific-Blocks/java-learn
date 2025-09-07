package com.hy.work.topic06;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }

    public void catchMouse() {
        System.out.println("颜色为" + this.getColor() + "的" + this.getAge() + "岁的猫在逮老鼠");
    }

    @Override
    public void eat(String something) {
        System.out.println("颜色为" + this.getColor() + "的" + this.getAge() + "岁的猫在吃" + something);
    }
}
