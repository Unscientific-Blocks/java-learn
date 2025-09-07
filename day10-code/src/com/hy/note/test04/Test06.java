package com.hy.note.test04;

public class Test06 {
    public static void main(String[] args) {
        String phoneNumber = "15610872016";
        String result = phoneNumber.substring(0, 3);
        result += "****";
        result += phoneNumber.substring(7);
        System.out.println(result);
    }
}
