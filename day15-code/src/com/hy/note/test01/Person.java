package com.hy.note.test01;

public abstract class Person {
//抽象类和抽象方法的注意事项
//抽象类不能实例化
//抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
//可以有构造方法
//抽象类的子类
//  要么重写抽象类中的所有抽象方法
//  要么是抽象类

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

    public abstract void work();

    public static void sleep() {
        System.out.println("睡觉");
    }

}
