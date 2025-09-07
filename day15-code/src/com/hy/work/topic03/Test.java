package com.hy.work.topic03;

public class Test {
    public static void main(String[] args) {
        Play p1 = new Play();
        p1.playGame();

        new IPlay() {
            public void playGame() {
                System.out.println("playGame");
            }
        }.playGame();

        FunZi funZi = new FunZi();
        funZi.fun();

        new FunZi() {
            public void fun() {
                System.out.println("fun");
            }
        }.fun();
    }
}
