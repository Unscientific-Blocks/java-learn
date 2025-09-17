package com.hy.note.generics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
