package com.hy.note;

public class note07 {
    public static void main(String[] args) {
//        数组
//        格式：
//        静态初始化
//        完整格式：
//        数据类型[] 数组名 = new 数据类型[] {元素1,元素2,元素3,...};
//        简化格式：
//        数据类型[] 数组名 = {元素1,元素2,元素3,...};


//        (1)定义数组存储5个学生的年龄;
        int [] age1 = new int[]{15,16,17,18,19};
        int [] age2 = {11,12,13,14,15};

//        (2)定义数组存储3个学生的姓名;
        String[] name1 = new String[]{"张三","李四","王五"};
        String[] name2 = {"张三","李四","王五"};

//        (3)定义数组存储4个学生的身高;
        double[] heigt = {1.92,1.83,1.67,1,65};
        System.out.println(name1);

    }
}
