package com.hy.work.topic02;

public class Teacher extends Person {
    private String department;

    public Teacher() {
    }

    public Teacher(int age, String name, String department) {
        super(age, name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void publishForm() {
        System.out.println("发布问题");
    }

    @Override
    public void showClass() {
        System.out.println("查询" + this.getName() + "的课表");
    }
}
