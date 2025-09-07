package com.hy.work.topic05;

public class Test {
    public static void main(String[] args) {
        Manger m1 = new Manger("Xiexie", 2999.98,"0001",9888);
        m1.work();
        Programmer p1 = new Programmer("Huigui", 13999.99,"1001");
        p1.work();
        System.out.println(m1.getSalary());
    }
}
