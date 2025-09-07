package com.hy.note.test02;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("黑", 2);
        Cat cat = new Cat("灰", 3);
        Person p1 = new Person(30,"老王");
        Person p2 = new Person(25, "老李");
        p1.keepPet(dog, "骨头");
        p2.keepPet(cat, "鱼");
//        p2.keepPet(p1, "肉");
    }
}
