package com.hy.work.topic05;

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(String name, double salary, String workId) {
        super(name, salary, workId);
    }

    @Override
    public void work() {
        System.out.println("程序员在写代码");
    }
}
