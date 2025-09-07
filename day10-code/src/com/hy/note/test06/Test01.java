package com.hy.note.test06;

import java.util.StringJoiner;

public class Test01 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        System.out.println(sj.add("a").add("b").add("c"));
    }
}
