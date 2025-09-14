package com.hy.note.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)                 添加
        public void clear()                     清空
        public boolean remove(E e)              删除
        public boolean contains(Object obj）    判断是否包含
        public boolean isEmpty()                判断是否为空
        public int size()                       集合长度


       注意点：
            collection是一个接口，我们不能直接创建他的对象。
            所以，现在我们学习他的方法时，只能创建他实现类的对象。
            实现类：ArrayList
         */

        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1：如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2：如果我们要往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
        //如果当前要添加的元素已经存在，方法返回false，表示添加失败。
        //因为Set系列的集合不允许重复。
        coll.add("aaa");
        coll.add("bbb");
        //System.out.println(coll.add("ccc"));
        //System.out.println(coll);

        //2.清空
        coll.clear();
        //System.out.println(coll);

        //3.删除
        //Collection定义的是共性的方法，此事不能通过索引进行删除
        coll.add("ddd");
        coll.add("ddd");
        coll.remove("ddd");
        //System.out.println(coll);
        coll.remove("ddd");
        //System.out.println(coll);

        coll.clear();

        //4.判断元素是否存在
        //细节：底层是依赖equals方法进行判断是否存在的。
        //所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，
        //那么在javabean类中，一定要重写equals方法。
        coll.add("aaa");
        coll.add("bbb");
        System.out.println(coll.contains("bbb"));

        //5.判断是否为空
        System.out.println(coll.isEmpty());

        //6.集合长度
        System.out.println(coll.size());
    }
}
