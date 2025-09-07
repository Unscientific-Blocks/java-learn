package com.hy.work.topic01;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle(10.9);
        Oblong o1 = new Oblong(20.4, 32.8);
        show(c1);
        show(o1);
    }

    public static void show(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
