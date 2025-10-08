package com.hy.note.set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        /*
        利用Set系列的集合，添加字符串，并使用多种方式遍历。
            选代器
            增强for
            Lambda表达式
        */
        Set<String> set = new HashSet<>();
        boolean b1 = set.add("zhangsan");
        boolean b2 = set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");
        set.add("zhaoliu");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(set);

//        选代器
//        Iterator<String> it = set.iterator();
//        while (it.hasNext()) {
//            String str = it.next();
//            System.out.println(str);
//        }

//        增强for
//        for (String str : set) {
//            System.out.println(str);
//        }

//        Lambda表达式
        set.forEach(string -> System.out.println(string));
    }
}
