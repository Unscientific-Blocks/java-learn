package com.hy.work.topic04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = sdf.parse("2006-01-23");
        long aliveTime = System.currentTimeMillis() - birth.getTime();
        int day = (int) (aliveTime / 1000 / 60 / 60 / 24);
        System.out.println(day);
    }
}
