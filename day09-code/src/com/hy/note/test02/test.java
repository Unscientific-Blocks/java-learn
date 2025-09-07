package com.hy.note.test02;

public class test {
    public static void main(String[] args) {
        Role r1 = new Role("易雯静", 100,'女');
        Role r2 = new Role("谭孝晶", 100, '女');

        r1.getRoleInfo();
        r2.getRoleInfo();

        while (true) {
            r1.attack(r2);
            if (r2.getBlood() == 0){
                System.out.println(r1.getRoleName() + "K.O了" + r2.getRoleName());
                break;
            }
            r2.attack(r1);
            if (r1.getBlood() == 0){
                System.out.println(r2.getRoleName() + "K.O了" + r1.getRoleName());
                break;
            }
        }
    }
}
