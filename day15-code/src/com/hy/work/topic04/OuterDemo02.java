package com.hy.work.topic04;

interface Inter02 {
    void show();
}

class Outer02 {
    public static Inter02 method() {
        return new Inter02() {
            @Override
            public void show() {
                System.out.println("Hello World");
            }
        };
    }
    //补齐代码
}

public class OuterDemo02 {
    public static void main(String[] args) {
        Outer02.method().show();
    }
}
