package com.hy.note.test10;

public class Test03 {
    public static void main(String[] args) {
        String s = "Hello World ";
        int begin = s.length() - 1;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                begin = i;
                break;
            }
        }
        for (int i = begin; i > 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
