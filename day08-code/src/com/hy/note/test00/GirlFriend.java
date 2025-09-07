package com.hy.note.test00;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age >= 14 && age < 30) {
        this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void playGame(){
        System.out.println("在玩游戏");
    }

    public void sleep(){
        System.out.println(name + "在睡觉");
    }
}
