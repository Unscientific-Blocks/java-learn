package com.hy.note.generics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    public static<E> void addAll(ArrayList<E> arrayList, E e1, E e2, E e3, E e4, E e5) {
        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
    }
    
    public static<E> void addAll2(ArrayList<E> arrayList, E...e) {
        for (E element : e) {
            arrayList.add(element);
        }
    }
}
