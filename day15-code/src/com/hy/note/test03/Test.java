package com.hy.note.test03;

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit(2, "小白");
        System.out.println(rabbit.getName() + ", " + rabbit.getAge());
        rabbit.eat();

        Dog dog = new Dog(3, "小黑");
        System.out.println(dog.getName() + ", " + dog.getAge());
        dog.eat();
        dog.swim();

        Frog frog = new Frog(1, "小青");
        System.out.println(frog.getName() + ", " + frog.getAge());
        frog.eat();
        frog.swim();
    }
}
