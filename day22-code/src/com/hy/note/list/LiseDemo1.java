package com.hy.note.list;

import java.util.ArrayList;
import java.util.List;

public class LiseDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法：
        void add(int index,E element)   在此集合中的指定位置插入指定的元素
        E remove(int index)             删除指定索引处的元素，返回被册除的元素
        E set(int index,E element)      修改指定索引处的元素，返回被修改的元素
        E get(int index)                返回指定索引处的元素
        */

        //1.创建一个集合
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add(int index,E element)在此集合中的指定位置插入指定的元素
        //细节：原来索引上的元素会依次往后移
        list.add(1, "qqq");

        //E remove(int index)             删除指定索引处的元素，返回被册除的元素
        System.out.println(list.remove(1));

        //E set(int index,E element)      修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(0, "ddd"));

        System.out.println(list);
    }
}
