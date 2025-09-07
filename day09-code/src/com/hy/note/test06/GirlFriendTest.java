package com.hy.note.test06;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("易雯静", 19, "女", "玩游戏");
        GirlFriend gf2 = new GirlFriend("乃木园子", 16, "女", "睡觉");
        GirlFriend gf3 = new GirlFriend("东乡美森", 23, "女", "敲代码");
        GirlFriend gf4 = new GirlFriend("结城友奈", 20, "女", "做好事");
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            sum += gf.getAge();
        }
        double avg = (double) sum / arr.length;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getAge());
            }
        }
        System.out.println(count);
    }
}
