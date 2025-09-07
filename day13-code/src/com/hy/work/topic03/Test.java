package com.hy.work.topic03;

public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple", 8999.98);
        phone.call();
        phone.playGame();
        phone.sendMessage();
        phone.setSize(7);
        System.out.println(phone.getSize());
        System.out.println(Phone.size);
        Phone phone1 = new Phone();
        System.out.println(phone1.getSize());
    }
}
