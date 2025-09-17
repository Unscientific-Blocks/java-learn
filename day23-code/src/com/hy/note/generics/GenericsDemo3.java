package com.hy.note.generics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ListUtil.addAll(list1, "111", "222", "333", "444", "555");
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        ListUtil.addAll(list2, 1, 2, 3, 4, 5);
        System.out.println(list2);

        ListUtil.addAll2(list2, 1, 2, 3);
        System.out.println(list2 );
    }
}
