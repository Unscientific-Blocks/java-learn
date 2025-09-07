package com.hy.note.test05;

public class Test {
    public static void main(String[] args) {
        Manger manger = new Manger("YUE001", "管理者", 39999.9,8000);
        manger.work();
        manger.eat();
        System.out.println(manger.getId() + "\t" + manger.getName() + "\t" + manger.getSalary() + "\t" + manger.getManageBonuses());
        manger.setSalary(29999.9);
        System.out.println(manger.getId() + "\t" + manger.getName() + "\t" + manger.getSalary() + "\t" + manger.getManageBonuses());

        Cook cook = new Cook("YUE101", "厨师", 6999.9);
        cook.work();
        cook.eat();
        System.out.println(cook.getId() + "\t" + cook.getName() + "\t" + cook.getSalary());
    }
}
