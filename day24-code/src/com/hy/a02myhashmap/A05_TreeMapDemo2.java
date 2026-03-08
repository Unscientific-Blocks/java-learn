package com.hy.a02myhashmap;

import java.util.TreeMap;

public class A05_TreeMapDemo2 {
    public static void main(String[] args) {
        //需求2:
        //键：学生对象
        //值：籍贯
        //要求：按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
        TreeMap<Student, String> tm = new TreeMap<>();
        Student s2 = new Student("姚尚艺", 18);
        Student s3 = new Student("欧阳鹏娜", 19);
        Student s5 = new Student("aac", 20);
        Student s1 = new Student("易雯静", 17);
        Student s4 = new Student("aab", 20);
        tm.put(s1, "郴州");
        tm.put(s2, "邵阳");
        tm.put(s3, "郴州");
        tm.put(s4, "长沙");
        tm.put(s5, "长沙");
        System.out.println(tm);
    }
}
