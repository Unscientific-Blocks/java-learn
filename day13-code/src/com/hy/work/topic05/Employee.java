package com.hy.work.topic05;

public class Employee {
    private String name;
    private String workId;
    private double salary;

    public Employee() {
    }

    public Employee(String name, double salary, String workId) {
        this.name = name;
        this.salary = salary;
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public void work() {
        System.out.println("员工在工作");
    }
}
