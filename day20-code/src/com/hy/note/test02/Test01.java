package com.hy.note.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        //public SimpleDateFormat()                 默认格式
        //public SimpleDateFormat(String pattern)   指定格式
        //public final String format(Date date)     格式化（日期对象->字符串）
        //public Date parse(String source)          解析（字符串->日期对象）

        /*
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date();
        System.out.println(sdf1.format(d1));

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 E a KK:mm:ss S毫秒");
        Date d2 = new Date();
        System.out.println(sdf2.format(d2));
         */

        String time1 = "2025年09月04日 22:21:43";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf1.parse(time1);
        System.out.println(d1);
        System.out.println(d1.getTime());
    }
}
