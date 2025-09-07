package com.hy.note.test04;

public class Test07 {
    public static void main(String[] args) {
        String id = "192168202503261204";
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);
        int sex = id.charAt(16) - ('0' + 0);
        String gender = "";
        if (sex % 2 == 0) {
            gender = "女";
        } else {
            gender = "男";
        }
        String result = "人物信息为:\n出生年月日: %s年%s月%s日\n性别为: %s";
        System.out.printf(result,year,month,day,gender);
    }
}
