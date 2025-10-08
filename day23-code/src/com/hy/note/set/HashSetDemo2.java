package com.hy.note.set;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现在控制台遍历该集合。
        要求：学生对象的成员变量值相同，我们就认为是同一个对象
         */
        HashSet<Student> hs = new HashSet<>();
        Student s1 = new Student("张三", 23);
        Student s2 = new Student("李四", 24);
        Student s3 = new Student("王五", 25);
        Student s4 = new Student("张三", 23);
        System.out.println(hs.add(s2));
        System.out.println(hs.add(s3));
        System.out.println(hs.add(s1));
        System.out.println(hs.add(s4));
        System.out.println(hs);
    }
}
