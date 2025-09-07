package com.hy.work.topic02;

public class Phone {
    public String name;

    public Phone() {
    }

    public Phone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println("手机在打电话");
    }

    public void sendMassage() {
        System.out.println("手机在发短信");
    }
}
