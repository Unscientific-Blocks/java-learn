package com.hy.work.topic02;

public class Student extends Person {
    private String classroom;

    public Student() {
    }

    public Student(int age, String name, String classroom) {
        super(age, name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void fillForm() {
        System.out.println("填写听课反馈");
    }

    @Override
    public void showClass() {
        System.out.println("查询" + this.getName() + "的课表");
    }
}
