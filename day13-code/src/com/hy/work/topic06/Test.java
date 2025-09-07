package com.hy.work.topic06;

public class Test {
    public static void main(String[] args) {
        Person person = new Person(18, "Huihui");
        Dog dog = new Dog(2, "黑色");
        Cat cat = new Cat(2, "白色");
        person.keepPet(dog, "骨头");
        person.keepPet(cat, "小鱼干");
    }
}
