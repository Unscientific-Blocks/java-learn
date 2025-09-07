package com.hy.note.test07;

public class PingPongCoach extends Coach implements LearnEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(int age, String name) {
        super(age, name);
    }

    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void learnEnglish() {
        System.out.println("学英语");
    }
}
