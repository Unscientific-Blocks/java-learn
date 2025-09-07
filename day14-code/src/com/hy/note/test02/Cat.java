package com.hy.note.test02;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String color, int age) {
        super(color, age);
    }

    @Override
    public void eat(String something) {
        System.out.println(this.getAge() + "岁的" + this.getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫在捉老鼠");
    }
}
