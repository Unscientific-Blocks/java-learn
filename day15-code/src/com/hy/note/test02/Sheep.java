package com.hy.note.test02;

public class Sheep extends Animal {
    public Sheep() {
    }

    public Sheep(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃草");
    }
}
