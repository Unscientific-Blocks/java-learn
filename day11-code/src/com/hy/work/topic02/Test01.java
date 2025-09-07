package com.hy.work.topic02;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
//姓名：赵老师, 专业：javase
//姓名：钱老师, 专业：javaee
//姓名：孙老师, 专业：php
//姓名：李老师, 专业：python
        ArrayList<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher("赵老师", "javase");
        Teacher t2 = new Teacher("钱老师", "javaee");
        Teacher t3 = new Teacher("孙老师", "php");
        Teacher t4 = new Teacher("李老师", "python");
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        teachers.add(t4);
        for (int i = 0; i < teachers.size(); i++) {
            System.out.print("姓名：" + teachers.get(i).getName() + ", 专业：" + teachers.get(i).getSubjects() + "\n");
        }
    }
}
