package com.hy.note.test02;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog dog) {
            System.out.printf("年龄为%s岁的%s养了一只%s颜色的%s岁的狗\n", age, name, animal.getColor(), animal.getAge());
            dog.eat(something);
        } else if (animal instanceof Cat cat) {
            System.out.printf("年龄为%s岁的%s养了一只%s颜色的%s岁的猫\n", age, name, animal.getColor(), animal.getAge());
            cat.eat(something);
        }
    }
}
