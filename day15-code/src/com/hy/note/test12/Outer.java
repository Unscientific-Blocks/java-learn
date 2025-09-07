package com.hy.note.test12;

public class Outer {
    private int a = 10;

    class Inner{
        int a = 20;
        public void show() {
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }
    }

    public Inner getInstance(){
        return new Inner();
    }
}
