package com.hy.note.set;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建TreeSet集合，并添加3个学生对象
        学生对象属性：
                姓名，年龄。
        要求按照学生的年龄进行排序
        同年龄按照姓名字母排列（暂不考虑中文）
        同姓名，同年龄认为是同一个人

        方式一：
            默认的排序规则/自然排序
            javaBean类实现comparable接口，重写里面的抽象方法。再指定比较规则
         */

        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 23);
        Student s3 = new Student("wangwu", 23);

        TreeSet<Student> ts1 = new TreeSet<>();
        ts1.add(s3);
        ts1.add(s2);
        ts1.add(s1);

        System.out.println(ts1);

    }
}
