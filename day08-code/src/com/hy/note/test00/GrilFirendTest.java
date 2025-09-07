package com.hy.note.test00;

public class GrilFirendTest {
    public static void main(String[] args) {
        GirlFriend ywj = new GirlFriend();
        ywj.setName("易雯静");
        ywj.setAge(19);
        ywj.setGender("女");

        System.out.println(ywj.getName());
        System.out.println(ywj.getAge());
        System.out.println(ywj.getGender());

        ywj.sleep();

        System.out.println("-----------------------");

        GirlFriend qs = new GirlFriend();

        qs.setName("锦木千束");
        qs.setAge(18);
        qs.setGender("萌妹子");

        System.out.println(qs.getName());
        System.out.println(qs.getAge());
        System.out.println(qs.getGender());

        qs.sleep();
    }
}
