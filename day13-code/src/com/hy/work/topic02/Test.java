package com.hy.work.topic02;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("hehe");
        t1.setAge(28);
        t1.setDepartment("信息技术部");
        t1.publishForm();
        t1.showClass();

        Student s1 = new Student(19,"lisi", "302");
        s1.fillForm();
        s1.showClass();

    }
}
