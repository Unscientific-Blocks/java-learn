package com.hy.note.test01;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
/*      添加      boolean add(E e)

        删除      boolean remove(E e)
                  E remove(int index])

        修改      E set(int index,E e)

        查询      E get(int index)

        获取长度   int size()
*/

//        1.创建集合
        ArrayList<String> list = new ArrayList<>();
//        2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ccc");
        System.out.println(list);
//        3.删除元素
//        boolean remove1 = list.remove("DDD");
//        System.out.println(remove1);
//        System.out.println(list);

//        String remove2 = list.remove(2);
//        System.out.println(remove2);
//        System.out.println(list);
//        4.修改元素
        String result = list.set(3, "ddd");
        System.out.println(result);
        System.out.println(list);
//        5.查询
        String s = list.get(0);
        System.out.println(s);
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            System.out.println(s1);
        }
    }
}
