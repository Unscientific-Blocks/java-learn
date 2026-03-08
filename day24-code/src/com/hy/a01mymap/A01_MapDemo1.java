package com.hy.a01mymap;

import java.util.*;

public class A01_MapDemo1 {
    public static void main(String[] args) {
        /*
        V put(K key,V value)                    添加元素
        V remove(object key)                    根据键删除键值对元素
        void clear()                            移除所有的键值对元素
        boolean containsKey(object key)         判断集合是否包含指定的键
        boolean containsValue(object value)     判断集合是否包含指定的值
        boolean isEmpty()                       判断集合是否为空
        int size()                              集合的长度，也就是集合中键值对的个数
         */

        //1.创建map集合对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        //put方法的细节
        //添加|覆盖
        //添加数据时，如果键不存在，那么直接把键值对对象添加到map集合中，并返回null
        //添加数据时，如果键存在，会把原有的键值对对象覆盖，并返回被覆盖的值
        System.out.println(map.put("key1", "value1"));
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
//        String value2 = map.put("key2", "value5");
//        System.out.println(value2);

//        String key1 = map.remove("key1");
//        System.out.println(key1);

//        map.clear();

//        boolean result = map.containsKey("key2");
//        System.out.println(result);
//
//        boolean result2 = map.containsValue("value2");
//        System.out.println(result2);

//        boolean result = map.isEmpty();
//        System.out.println(result);

         int size = map.size();
        System.out.println(size);

        System.out.println(map);

        List<String> list = new ArrayList<>();
        System.out.println(list.add("aaa"));
        System.out.println(list.add("AAA"));
//        for (String s : list) {
//            System.out.println(s);
//        }
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        list.forEach(s -> {
//            System.out.println(s);
//        });

    }
}
