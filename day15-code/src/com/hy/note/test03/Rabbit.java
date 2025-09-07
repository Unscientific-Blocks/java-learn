package com.hy.note.test03;

public class Rabbit extends Animal {

    public Rabbit() {
    }

    public Rabbit(int age, String name) {
        super(age, name);
    }

    @Override
    public void eat() {
        System.out.println("吃胡萝卜");
    }
}
