package com.hy.work.topic02;

public class Person {
//学生信息和行为（名称，年龄，所在班级，查看课表，填写听课反馈fillForm）
//老师信息和行为（名称，年龄，部门名称，查看课表，发布问题publishForm）
//定义角色类作为父类包含属性（名称，年龄），行为（查看课表）
//定义子类：学生类包含属性（所在班级），行为（填写听课反馈）
//定义子类：老师类包含属性（部门名称），行为（发布问题）
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

    public void showClass() {
        System.out.println("查看课表");
    }
}
