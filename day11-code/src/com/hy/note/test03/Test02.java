package com.hy.note.test03;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        String s = "[";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                s += list.get(i);
            } else {
                s += list.get(i) + ",";
            }
        }
        s += "]";
        System.out.println(s);
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        System.out.print("[");
        for (int i = 0; i < chars.size(); i++) {
            if (i == chars.size() - 1) {
                System.out.print(chars.get(i));
            } else {
                System.out.print(chars.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
