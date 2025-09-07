package com.hy.note.test03;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Teat01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("ss");
        list.add("dd");
        list.add("ff");
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < list.size(); i++) {
            sj.add(list.get(i));
        }
        System.out.println(sj.toString());
    }
}
