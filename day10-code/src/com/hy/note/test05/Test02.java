package com.hy.note.test05;

public class Test02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("AAA").append("bbb").append(10);


        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
    }
}
