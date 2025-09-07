package com.hy.note.test15;

public class Test {
    public static void main(String[] args) {
//      接口多态
        Swim s = new Swim() {
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };

        s.swim();
        new Swim() {
            @Override
            public void swim() {
                System.out.println("swim swim");
            }
        }.swim();


        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("eat");
                    }
                }
        );
    }

    public static void method(Animal animal) {
        animal.eat();
    }
}
