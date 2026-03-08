package com.hy.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //map集合的第一种遍历方式

        //三个课堂练习：
        //练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用1ambda表达式的形式进行遍历

        Map<String, String> map = new HashMap<>();
        map.put("HTT", "阿梓喵");
        map.put("PoppinParty", "户山香澄");
        map.put("Mygo", "高松灯");

        //通过键找值
        //获取所有的键，并放入一个单列集合中
        //Set<String> keys = map.keySet();
        //遍历单列集合，得到每一个键


        //练习一：利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
//        Set<String> keys = map.keySet();
//        Iterator<String> iterator = keys.iterator();
//        while (iterator.hasNext()) {
//            String key = iterator.next();
//            //利用map集合中的键获取对应的值 get
//            String value = map.get(key);
//            System.out.println(key + " : " + value);
//        }

        //练习二：利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
//        Set<String> keys = map.keySet();
//        for (String key : keys) {
//            System.out.println(key + " = " + map.get(key));
//        }


        //练习三：利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
        Set<String> keys = map.keySet();
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(string + " = " + map.get(string));
            }
        });


    }
}
