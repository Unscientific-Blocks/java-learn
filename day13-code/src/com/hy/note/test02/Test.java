package com.hy.note.test02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 22, "男");
        Student stu2 = new Student("李四", 21, "女");
        Student stu3 = new Student("王五", 18, "男");
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        System.out.println(StudentUtil.getMaxAge(students));
    }
}
