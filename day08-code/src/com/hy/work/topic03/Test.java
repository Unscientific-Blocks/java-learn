package com.hy.work.topic03;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager(15000.0, 6000.0, 123, "张三");
        manager.work();
        Coder coder = new Coder();
        coder.setName("李四");
        coder.setId(135);
        coder.setSalary(10000);
        coder.work();
    }

}
