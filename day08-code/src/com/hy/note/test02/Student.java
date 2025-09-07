package com.hy.note.test02;

public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("构造方法");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
