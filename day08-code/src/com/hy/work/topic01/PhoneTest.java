package com.hy.work.topic01;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("小米", 1899, "黑色");
        phone1.call();
        phone1.sendMessage();
        Phone phone2 = new Phone();
        phone2.setBrand("苹果");
        phone2.setColor("白色");
        phone2.setPrice(8999);
        phone2.call();
        phone2.sendMessage();
    }
}
