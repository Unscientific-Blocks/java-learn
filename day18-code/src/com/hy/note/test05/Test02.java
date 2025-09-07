package com.hy.note.test05;

public class Test02 {
    public static void main(String[] args) {
        Student s1 = new Student(33, "zhangsan");
        Student s2 = new Student(33, "zhangsan");
        boolean b1 = s1.equals(s2);
        System.out.println(b1);
    }
}
