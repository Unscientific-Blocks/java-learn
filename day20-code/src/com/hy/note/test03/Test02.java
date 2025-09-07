package com.hy.note.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        //计算班长出生那天是星期几(假如班长出生日期为：1998年3月18日)
        String birthStr = "1998年3月18日";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date birthDate = sdf.parse(birthStr);
        Calendar c1 = Calendar.getInstance();
        c1.setTime(birthDate);
        System.out.println(Test01.getWeek(c1.get(Calendar.DAY_OF_WEEK)));

        Calendar c2 = Calendar.getInstance();
        c2.add(Calendar.DATE, 200);
        System.out.println(c2.get(Calendar.YEAR) + ", " + (c2.get(Calendar.MONTH) + 1) + ", " + c2.get(Calendar.DAY_OF_MONTH) + ", " + Test01.getWeek(c2.get(Calendar.DAY_OF_WEEK)));
    }
}
