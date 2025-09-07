package com.hy.note.test05;

import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {
/*
        public static boolean equals(object a,Object b)     先做非空判断，比较两个对象
        public static boolean isNull(object obj)            判断对象是否为null，为null返回true，反之
        public static boolean nonNull(object obj)           判断对象是否为null，跟isNull的结果相反

 */
        Student s1 = null;
        Student s2 = new Student(24, "zhangsan");
//        if (s1 == null) {
//            System.out.println("空指针异常");
//        } else {
//            System.out.println(s1.equals(s2));
//        }

        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.equals(s2, s2));
    }
}
