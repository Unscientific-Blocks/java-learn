package com.hy.work.topic05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {
    public static void main(String[] args) throws ParseException {
        //判断任意的一个年份是闰年还是平年
        //要求：用JDK7和JDK8两种方式判断
        //提示:
        //二月有29天是闰年
        //一年有366天是闰年

        //JDK7
        String year = "2020";
        String startStr = year + "-01-01";
        String endStr = (Integer.parseInt(year) + 1) + "-01-01";
        Date startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startStr);
        Date endDate = new SimpleDateFormat("yyyy-MM-dd").parse(endStr);
        long diff = endDate.getTime() - startDate.getTime();
        int day = (int) (diff / 1000 / 3600 / 24);
        if (day == 365) {
            System.out.println("平年");
        } else if (day == 366) {
            System.out.println("闰年");
        }
    }
}
