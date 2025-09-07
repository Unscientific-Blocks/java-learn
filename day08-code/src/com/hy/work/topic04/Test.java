package com.hy.work.topic04;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("花色", "波斯猫");
        Dog dog = new Dog("黑色", "藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
