package com.hy.note.test14;

public class Outer {


    public void show() {
        int a = 10;

        class Inner{
            String name;
            int age;

            public void method1() {
                System.out.println(name+":"+age);
                System.out.println("局部内部类中的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类中的method2静态方法");
            }
        }

        Inner inner = new Inner();
        System.out.println(inner.name);
        System.out.println(inner.age);
        inner.method1();
        inner.method2();
    }
}
