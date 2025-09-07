package com.hy.note.test04;

import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cars[] arr = new Cars[3];
        for (int i = 0; i < arr.length; i++) {
            Cars car1 = new Cars();
            System.out.println("请输入第" + (i + 1) + "部汽车的品牌:");
            String brand = sc.next();
            car1.setBrand(brand);
            System.out.println("请输入第" + (i + 1) + "部汽车的价格:");
            double price = sc.nextDouble();
            car1.setPrice(price);
            System.out.println("请输入第" + (i + 1) + "部汽车的颜色:");
            String color = sc.next();
            car1.setColor(color);
            arr[i] = car1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getBrand() + arr[i].getPrice() + arr[i].getColor());
        }
    }
}
