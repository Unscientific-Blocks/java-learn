package com.hy.note.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
    public static void main(String[] args) {
         /*
        List系列集合的五种遍历方式：
            1.选代器
            2.列表迭代器
            3.增强for
            4.Lambda表达式
            5.普通for循环
          */


        //创建一个集合
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //1.选代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //2.增强for
        for (String s : list) {
            System.out.println(s);
        }

        //3.Lambda表达式
        list.forEach(s -> System.out.println(s));

        //4.普通for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("------------------");

        //5.列表迭代器
        ListIterator<String> lt = list.listIterator();
        while (lt.hasNext()) {
            String str = lt.next();
            if (str.equals("bbb")) {
                lt.add("qqq");
            }
            System.out.println(str);
        }
        System.out.println(list);

    }
}
