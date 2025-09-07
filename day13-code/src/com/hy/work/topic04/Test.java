package com.hy.work.topic04;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(19, "女", "Wenjing YI", "Canada", "Sike", "3242220234");
        Worker worker = new Worker(32, "男", "Wenjing YE", "English", "Airpork", 5);
        StudentLeader sl = new StudentLeader();
        student.work();
        worker.work();
        sl.meeting();
    }
}
