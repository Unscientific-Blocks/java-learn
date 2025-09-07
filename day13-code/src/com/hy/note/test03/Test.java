package com.hy.note.test03;

public class Test {
    public static void main(String[] args) {
//        1．Java只能单继承，不能多继承、但是可以多层继承。
//        2.Java中所有的类都直接或者间接继承于Object类
//        3．子类只能访问父类中非私有的成员
        Husky husky1 = new Husky();
        husky1.eat();
    }
}
