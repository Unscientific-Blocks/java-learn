package com.hy.work.topic01;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
//        "aaa", "bbb", "aaa", "aaa", "ccc", "bbb"
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
