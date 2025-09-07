package com.hy.note.test05;

import java.util.ArrayList;

public class UserTest01 {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User(001, "zhangsan", "123456");
        User user2 = new User(002, "lisi", "12345678");
        User user3 = new User(003, "zhangsan", "password");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        System.out.println(Exist(users, 004));
    }

    public static int Exist(ArrayList<User> users, int id) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
