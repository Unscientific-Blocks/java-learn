package com.hy.work.topic02;

public class GirlFriend {
    String name;
    double height;
    double weight;

    public GirlFriend(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public void wash() {
        System.out.println("女朋友帮我洗衣服");
    }

    public void cook() {
        System.out.println("女朋友给我做饭");
    }

    public void show() {
        System.out.println("我女朋友叫凤姐,身高" + height + "厘米,体重" + weight + "斤");
    }
}
