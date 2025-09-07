package com.hy.note.test02;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test03 {
    public static void main(String[] args) throws ParseException {
        /*需求：
            秒杀活动：2023年11月11日0:0:0
            开始时间：2023年11月11日0:10:0
            小贾下单并付款的时间为：2023年11月11日0:01:00
            小皮下单并付款的时间为：2023年11月11日0:11:0
            用代码说明这两位同学有没有参加上秒杀活动？
        */
        String start = "2023年11月11日0:0:0";
        String end = "2023年11月11日0:10:0";
        String jia = "2023年11月10日23:59:00";
        String pi = "2023年11月11日0:11:00";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
        Long startTime = sdf.parse(start).getTime();
        Long endTime = sdf.parse(end).getTime();
        Long jiaTime = sdf.parse(jia).getTime();
        Long piTime = sdf.parse(pi).getTime();
        check(startTime, endTime, jiaTime);
        check(startTime, endTime, piTime);

    }

    public static void check(Long startTime, Long endTime, Long userTime) {
        if (userTime >= startTime && userTime <= endTime) {
            System.out.println("参加上秒杀活动");
        } else {
            System.out.println("没有参加上秒杀活动");
        }
    }
}
