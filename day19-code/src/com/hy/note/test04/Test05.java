package com.hy.note.test04;

public class Test05 {
    public static void main(String[] args) {
        /*
        需求:
            将字符串：我要学学编编编编程程程程程程。
            替换为：我要学编程

         */

        String str = "我要学学编编编编程程程程程程";
        String result = str.replaceAll("(.)\\1*(?=\\1)", "");
        System.out.println(result);
    }
}
