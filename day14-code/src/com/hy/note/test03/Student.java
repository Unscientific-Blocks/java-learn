package com.hy.note.test03;

public class Student {
    private String name;
    private int age;

    {
        System.out.println("构造代码块");
    }

    public Student() {
        System.out.println("无参构造");
    }

    public Student(int age, String name) {
        System.out.println("有参构造");
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
}
