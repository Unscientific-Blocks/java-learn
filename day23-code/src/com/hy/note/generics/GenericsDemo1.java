package com.hy.note.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //结论
        //如果没有给集合指定数据类型，默认所有数据的类型都是Object
        //此时可以往集合里添加任意数据类型
        //带来一个坏处:在获取数据时，无法使用它的特有行为

        //此时推出了泛型，可以在添加数据的时候就把类型进行统一。
        //而且我们在获取数据的时候，也省的强转了，非常地方便。

        //1.创建集合的对象
        ArrayList<String> list = new ArrayList<>();

        //2.添加数据
        //list.add(123);//Integer
        list.add("aaa");
        //list.add(new Student("zhangsan", 23));

        //3.遍历集合获取里面的每一个元素
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            //多态的弊端 不能访问子类独有的方法
            System.out.println(str);
        }


    }
}
