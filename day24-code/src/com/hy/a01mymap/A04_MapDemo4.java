package com.hy.a01mymap;

import java.util.HashMap;
import java.util.Map;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        //map 集合的第三种遍历方式

        Map<String, String> map = new HashMap<>();
        map.put("标枪选手","马超");
        map.put("人物挂件","明世隐");
        map.put("御龙骑士","尹志平");

        //利用lambda表达式进行遍历
        map.forEach((key, value) -> System.out.println(key+"="+value));
    }
}
