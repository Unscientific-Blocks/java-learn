package com.hy.work.topic03;

public class Phone {
//    属性:品牌brand,价格price
//    属性屏幕的尺寸(int size),而且所有手机的屏幕尺寸为6
//    行为:打电话call,发短信sendMessage,玩游戏playGame
    private String brand;
    private double price;
    public static int size = 6;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        Phone.size = size;
    }

    public void call() {
        System.out.println("价值" + this.price + "元的" + this.brand + "正在打电话");
    }

    public void sendMessage() {
        System.out.println("价值" + this.price + "元的" + this.brand + "正在发短信");
    }

    public void playGame() {
        System.out.println("价值" + this.price + "元的" + this.brand + "正在玩游戏");
    }
}
