package com.hy.note.test02;

import java.util.ArrayList;
//static的注意事项
//静态方法只能访问静态变量和静态方法
//非静态方法可以访问静态变量或者静态方法，也可以访问非静态的成员变量和非静态的成员方法
//静态方法中是没有this关键字
//总结：静态方法中，只能访问静态。
//非静态可以访问所有。
//静态中没有this关键字
public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAge(ArrayList<Student> students) {
        int maxAge = students.get(0).getAge();
        for (int i = 0; i < students.size(); i++) {
            int age = students.get(i).getAge();
            maxAge = maxAge > age ? maxAge : age;
        }
        return maxAge;
    }
}
