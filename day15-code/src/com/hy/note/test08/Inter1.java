package com.hy.note.test08;

public interface Inter1 {
    public abstract void method();

    public default void show1() {
        System.out.println("接口1中的默认方法 --- show1");
    }

    public default void show2() {
        System.out.println("接口1中的默认方法 --- show2");
    }
}
