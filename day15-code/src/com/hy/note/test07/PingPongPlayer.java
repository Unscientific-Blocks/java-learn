package com.hy.note.test07;

public class PingPongPlayer extends Player implements LearnEnglish{
    public PingPongPlayer() {
    }

    public PingPongPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }

    @Override
    public void learn() {
        System.out.println("学打乒乓球");
    }
}
