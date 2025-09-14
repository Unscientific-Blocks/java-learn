package com.hy.note.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList();
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student("wangwu",25);
        //因为contains方法在底层依赖equals方法判断对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用object类中的equals方法进行判断，
        //而object类中equals方法，依赖地址值进行判断。
        //需求：如果同姓名和同年龄，就认为是同一个学生
        System.out.println(coll.contains(s1));
        System.out.println(coll.contains(s4));

    }
}
