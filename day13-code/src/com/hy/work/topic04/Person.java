package com.hy.work.topic04;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String nationality;

    public Person() {
    }

    public Person(int age, String gender, String name, String nationality) {
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.nationality = nationality;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void work(){
        System.out.println("工作");
    }
}
