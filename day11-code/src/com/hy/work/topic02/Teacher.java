package com.hy.work.topic02;

public class Teacher {
    private String name;
    private String Subjects;

    public Teacher() {
    }

    public Teacher(String name, String subjects) {
        this.name = name;
        Subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjects() {
        return Subjects;
    }

    public void setSubjects(String subjects) {
        Subjects = subjects;
    }
}
