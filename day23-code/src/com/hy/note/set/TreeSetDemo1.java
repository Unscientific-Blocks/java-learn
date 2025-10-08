package com.hy.note.set;

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        需求：利用TreeSet存储整数并进行排序
         */

        TreeSet<Integer> ts1 = new TreeSet<>();
        ts1.add(3);
        ts1.add(1);
        ts1.add(5);
        ts1.add(2);
        ts1.add(4);
//        System.out.println(ts1);
        //遍历集合(三种方式)
        //迭代器
//        Iterator<Integer> iterator = ts1.iterator();
//        while (iterator.hasNext()) {
//            int element = iterator.next();
//            System.out.println(element);
//        }
        //增强for
//        for (Integer i : ts1) {
//            System.out.println(i);
//        }
        //lambda表达式
        ts1.forEach(integer -> System.out.println(integer));

    }
}
