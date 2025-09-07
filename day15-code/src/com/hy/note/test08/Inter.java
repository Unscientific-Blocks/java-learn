package com.hy.note.test08;

public interface Inter {
    /*
    JDK8以后接口中新增的方法
        允许在接口中定义默认方法，需要使用关键字 default 修饰作用:解决接口升级的问题
    接口中默认方法的定义格式:
        格式:public default 返回值类型 方法名(参数列表){}
        范例:public default void show(){}
    接口中默认方法的注意事项
        默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字
        public可以省略，default不能省略
        如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
    */

    public abstract void method();

    public default void show1() {
        System.out.println("接口中的默认方法 --- show1");
    }

    public default void show2() {
        System.out.println("接口中的默认方法 --- show2");
    }
}
