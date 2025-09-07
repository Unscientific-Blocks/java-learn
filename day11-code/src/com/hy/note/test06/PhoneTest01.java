package com.hy.note.test06;

import java.util.ArrayList;

public class PhoneTest01 {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        ArrayList<Phone> newPhones = lower3000(phones);
        for (int i = 0; i < newPhones.size(); i++) {
            System.out.println(newPhones.get(i).getBrand() + " " + newPhones.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> lower3000(ArrayList<Phone> phones) {
        ArrayList<Phone> newPhones = new ArrayList<>();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getPrice() < 3000) {
                newPhones.add(phones.get(i));
            }
        }
        return newPhones;
    }
}
