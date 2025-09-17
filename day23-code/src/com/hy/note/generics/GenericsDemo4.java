package com.hy.note.generics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
        泛型接口的两种使用方式：
        1.实现类给出具体的类型
        2.实现类延续泛型，创建实现类对象时再确定类型
        */

        MyArrayList2 list1 = new MyArrayList2();
        list1.add("123");
        System.out.println(list1);

        MyArrayList3<String> list2 = new MyArrayList3<>();
        list2.add("123");
        System.out.println(list2);

    }
}
