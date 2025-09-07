package com.hy.note.test04;

import java.util.ArrayList;

public class StudentTest01 {
    public static void main(String[] args) {
        Student stu1 = new Student("姚尚艺", 18);
        Student stu2 = new Student("周志威", 19);
        Student stu3 = new Student("易雯静", 19);
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + " " + students.get(i).getAge() );
        }
    }
}
