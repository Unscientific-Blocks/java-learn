package com.hy.work.topic02;

public class Test {
    public static void main(String[] args) {
        Phone oldPhone = new OldPhone();
        Phone newPhone = new NewPhone();

        System.out.println("使用旧手机：");
        usePhone(oldPhone);

        System.out.println("\n使用新手机：");
        usePhone(newPhone);
    }

    public static void usePhone(Phone phone){
        phone.call();
        phone.sendMassage();
        if (phone instanceof NewPhone newPhone){
            newPhone.play();
        }
    }
}
