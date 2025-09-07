package com.hy.note.test01;

public class test01 {
    public static void main(String[] args) {
        Role r1 = new Role();
        r1.setRoleName("汽车");
        r1.setBlood(100);
        Role r2 = new Role();
        r2.setRoleName("飞机");
        r2.setBlood(100);

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() ==0) {
                System.out.println(r1.getRoleName() + "打败了" + r2.getRoleName());
                break;
            }

            r2.attack(r1);
            if (r1.getBlood() ==0) {
                System.out.println(r2.getRoleName() + "打败了" + r1.getRoleName());
                break;
            }
        }
    }
}
