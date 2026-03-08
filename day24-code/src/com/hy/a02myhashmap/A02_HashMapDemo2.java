package com.hy.a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class A02_HashMapDemo2 {
    public static void main(String[] args) {
        //某个班级80名学生，现在需要组成秋游活动，
        //班长提供了四个景点依次是(A、B、C、D),
        //每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。

        String[] arr = {"A", "B", "C", "D"};
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 80; i++) {
            String str = arr[new Random().nextInt(4)];
            if (map.containsKey(str)) {
                int count = map.get(str);
                map.put(str, ++count);
            } else {
                map.put(str, 1);
            }
        }
        System.out.println(map);
        int max = 0;
        String maxKey = null;
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() == max) {
                System.out.println(entry.getKey());
            }
        }



    }
}
