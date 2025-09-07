package com.hy.work.topic05;

public class Test {
    public static void main(String[] args) {
        InterA a = new InterA() {
            @Override
            public void showA() {
                System.out.println("showA");
            }
        };
        a.showA();

        new InterA() {
            @Override
            public void showA() {
                System.out.println("showA");
            }
        }.showA();

        ImplA a1 = new ImplA();
        a1.showA();
    }
}
