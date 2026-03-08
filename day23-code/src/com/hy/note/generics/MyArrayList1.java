package com.hy.note.generics;

import java.util.Arrays;

public class MyArrayList1<T> {
    Object[] objects = new Object[10];
    int size;

    public boolean add(T e) {
        objects[size] = e;
        size++;
        return true;
    }

    public T get(int index) {
        return (T) objects[index];
    }

    public String toString() {
        return Arrays.toString(objects);
    }
}
