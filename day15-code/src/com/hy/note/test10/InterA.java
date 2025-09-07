package com.hy.note.test10;

public interface InterA {
    public default void show1(){
        System.out.println("show1 方法");
        show3();
    }

    public static void show2(){
        System.out.println("show2 方法");
        show4();
    }

//    普通的私有方法，给默认方法服务的
    private void show3(){
        System.out.println("重复代码");
    }

//    静态的私有方法，给静态方法服务的
    private static void show4(){
        System.out.println("重复代码");
    }
}
