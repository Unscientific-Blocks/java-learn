package com.hy.work.topic04;

interface Inter01 {
    void show();
}
class Outer01 {
    class Inner implements Inter01 {
        @Override
        public void show() {
            System.out.println("hello world");
        }
    }

    public static Inner method() {
        return new Outer01().new Inner();
    }

    //补齐代码
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer01.method().show();
    }
}