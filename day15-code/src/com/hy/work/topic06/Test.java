package com.hy.work.topic06;

public class Test {
    public static void main(String[] args) {
        B b = new B(
                new InterB() {
                    @Override
                    public void showB() {
                        System.out.println("showB");
                    }
                }
        );
        b.methodB();

        ImplB b2 = new ImplB();
        B b3 = new B(b2);
        b3.methodB();
    }
}
