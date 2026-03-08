package com.hy.a02myhashmap;

import java.util.StringJoiner;
import java.util.TreeMap;

public class A06_TreeMapDemo3 {
    public static void main(String[] args) {
        //需求：字符串“aababcabcdabcde"
        //请统计字符串中每一个字符出现的次数，并按照以下格式输出
        //输出结果:
        //a(5)b(4)c(3)d(2)e(1)

        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        StringJoiner sj = new StringJoiner("");
        map.forEach((key, value)->sj.add(key + "(" + value + ") "));

        System.out.println(sj);
    }
}
