package com.hy.a02myhashmap;

import java.util.TreeMap;

public class A04_TreeMapDemo1 {
    public static void main(String[] args) {
        //需求1:
        //键：整数表示id
        //值：字符串表示商品名称
        //要求：按照id的升序排列、按照id的降序排列

        TreeMap<Integer, String> tm1 = new TreeMap<>((Integer o1, Integer o2) -> o1 - o2);
        tm1.put(1, "手表");
        tm1.put(2, "电脑");
        tm1.put(3, "手机");
        tm1.put(4, "耳机");
        System.out.println(tm1);
    }
}
