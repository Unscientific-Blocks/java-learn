package com.hy.note.test12;

public class Test {
    public static void main(String[] args) {
        /*
编写成员内部类的注意点:
    1.成员内部类可以被一些修饰符所修饰，比如private，默认，protected,public，static等态变量，
        JDK 16开始才可以定义静态变量。
    2.在成员内部类里面，JDK16之前不能定义静
获取成员内部类对象的两种方式:
    方式一:外部类编写方法，对外提供内部类对象
    方式二:直接创建
        格式:外部类名.内部类名 对象名=外部类对象.内部类对象;
        范例:outer.Inner oi = new outer().new Inner();
        */

        //Outer.Inner oi = new Outer().new Inner();

        //Outer o = new Outer();
        //System.out.println(o.getInstance());
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
