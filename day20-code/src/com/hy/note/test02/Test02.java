package com.hy.note.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        //假设，你初恋的出生年月日为：2000-11-11
        //请用字符串表示这个数据，并将其转换为：2000年11月11日
        //String birthday = "2000-11-11";
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日").format(new SimpleDateFormat("yyyy-MM-dd").parse("2000-11-11")));

    }
}
