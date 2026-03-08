package com.hy.a02myhashmap;

import java.util.HashMap;

public class A01_HashMapDemo1 {
    public static void main(String[] args) {
//        创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
//        存储三个键值对元素，并遍历
//        要求：同姓名，同年龄认为是同一个学生

        HashMap<Student, String> map = new HashMap<>();
        Student s1 = new Student("易雯静", 19);
        Student s2 = new Student("姚尚艺", 19);
        Student s3 = new Student("欧阳鹏娜", 19);
        Student s4 = new Student("易雯静", 19);
        map.put(s1, "郴州");
        map.put(s2, "邵阳");
        map.put(s3, "郴州");
        map.put(s4, "长沙");

        map.forEach((key, value) -> System.out.println(key + " = " + value));
    }
}
