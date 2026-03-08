package com.hy.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //map 集合的第二种遍历方式

        //练习一：利用键值对对象遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：利用键值对对象遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：利用键值对对象遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历


        Map<String, String> map = new HashMap<>();
        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //通过键值对对象进行遍历
        //通过一个方法获取所有键值对对象，方法返回一个set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

//        for (Map.Entry<String, String> entry : entries) {
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key + " = " + value);
//        }

//        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> entry = iterator.next();
//            String key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+"="+value);
//        }

//        Iterator<Map.Entry<String, String>> keyIterator = entries.iterator();
//        Iterator<Map.Entry<String, String>> valueIterator = entries.iterator();
//        while (keyIterator.hasNext()) {
//            String key = keyIterator.next().getKey();
//            String value = valueIterator.next().getValue();
//            System.out.println(key + "=" + value);
//        }

        entries.forEach(entry -> System.out.println(entry.getKey() + "=" + entry.getValue()) );


    }
}
