package com.hy.work.topic02;

public class NewPhone extends Phone implements IPlay{
    public NewPhone() {
    }

    public NewPhone(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("手机在玩游戏");
    }
}
