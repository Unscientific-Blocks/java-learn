package com.hy.note.test04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("请输入学生的姓名:");
            String name = sc.next();
            System.out.println("请输入学生的年龄:");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            students.add(student);
            System.out.println("输入1以停止输入");
            String isStop = sc.next();
            if (isStop.equals("1")) {
                flag = false;
            }
        }
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName() + " - " + students.get(i).getAge());
        }
    }
}
