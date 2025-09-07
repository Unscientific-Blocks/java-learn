package com.hy.note.test01;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张三");
        student.setAge(18);
        Teacher teacher = new Teacher();
        teacher.setName("雷艳玲");
        teacher.setAge(38);
        Administrator administrator = new Administrator();
        administrator.setName("hui");
        administrator.setAge(22);
        Person person = teacher;
        System.out.println(person.getName());
        System.out.println(person.getAge());

        student.show();
        teacher.show();
        administrator.show();

    }

    public static void register(Person p) {
        p.show();
    }
}
