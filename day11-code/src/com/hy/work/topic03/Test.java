package com.hy.work.topic03;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //    有如下员工信息：
        //姓名：张三，工资：3000
        //姓名：李四，工资：3500
        //姓名：王五，工资：4000
        //姓名：赵六，工资：4500
        //姓名：田七，工资：5000
        //先需要将所有的员工信息都存入ArrayList集合中，并完成如下操作：
        //1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”
        //2、判断是否有姓名为“赵六”的员工，如果有，将其删除
        //3、给姓名为“田七”的员工，涨500工资
        ArrayList<Staff> staffs = new ArrayList<>();
        Staff staff1 = new Staff("张三", 3000);
        Staff staff2 = new Staff("李四", 3500);
        Staff staff3 = new Staff("王五", 4000);
        Staff staff4 = new Staff("赵六", 4500);
        Staff staff5 = new Staff("田七", 5000);
        staffs.add(staff1);
        staffs.add(staff2);
        staffs.add(staff3);
        staffs.add(staff4);
        staffs.add(staff5);
        if (Index(staffs, "王五") != -1) {
            staffs.get(Index(staffs, "王五")).setName("王小五");
        }
        if (Index(staffs, "赵六") != -1) {
            staffs.remove(Index(staffs, "赵六"));
        }
        if (Index(staffs, "田七") != -1) {
            staffs.get(Index(staffs, "田七")).setSalary(staffs.get(Index(staffs, "田七")).getSalary() + 500);
        }
        for (int i = 0; i < staffs.size(); i++) {
            System.out.println(staffs.get(i).getName() + "\t" +staffs.get(i).getSalary());
        }
    }
    public static int Index(ArrayList<Staff> staffs, String name) {
        for (int i = 0; i < staffs.size(); i++) {
            if (staffs.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
}
