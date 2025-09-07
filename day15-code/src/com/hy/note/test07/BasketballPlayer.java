package com.hy.note.test07;

public class BasketballPlayer extends Player {
    public BasketballPlayer() {
    }

    public BasketballPlayer(int age, String name) {
        super(age, name);
    }

    @Override
    public void learn() {
        System.out.println("学打篮球");
    }
}
