package com.hy.note.test07;

public abstract class Player extends Person {
    public Player() {
    }

    public Player(int age, String name) {
        super(age, name);
    }

    public abstract void learn();
}
