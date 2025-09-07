package com.hy.note.test05;

public class Test01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append(13);
        sb.append(-232);
        sb.append(0.31);
        sb.append(true);
        sb.reverse();
        System.out.println(sb);
        int length = sb.length();
        System.out.println(length);
    }
}
