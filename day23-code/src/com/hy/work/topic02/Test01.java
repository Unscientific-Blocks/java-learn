package com.hy.work.topic02;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        /*
        需求：
        定义一个继承结构：
                                             动物
                         |                                           |
                        猫                                           狗
                   |          |                                  |         |
                波斯猫       狸花猫                             泰迪       哈士奇


            属性：名字，年龄
            行为：吃东西
                波斯猫方法体打印：一只叫做XXX的，X岁的波斯猫，正在吃小饼干
                狸花猫方法体打印：一只叫做XXX的，X岁的狸花猫，正在吃鱼
                泰迪方法体打印：一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
                哈士奇方法体打印：一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家


        测试类中定义一个方法用于饲养动物
            public static void keepPet(ArrayList<???> list){
                //遍历集合，调用动物的eat方法
            }

        要求1：该方法能养所有品种的猫，但是不能养狗
        要求2：该方法能养所有品种的狗，但是不能养猫
        要求3：该方法能养所有的动物，但是不能传递其他类型
         */

        ArrayList<LihuaCat> list1 = new ArrayList<>();
        ArrayList<BosiCat> list2 = new ArrayList<>();
        ArrayList<Cat> list3 = new ArrayList<>();
        ArrayList<Hashiqi> list4 = new ArrayList<>();
        ArrayList<Taidi> list5 = new ArrayList<>();
        ArrayList<Dog> list6 = new ArrayList<>();
        ArrayList<Animal> list7 = new ArrayList<>();

        keepPet1(list1);
        keepPet1(list2);
        keepPet1(list3);
        keepPet1(list4);
        keepPet1(list5);
        keepPet1(list6);
        keepPet1(list7);

        keepPet2(list1);
        keepPet2(list2);
        keepPet2(list3);
        keepPet2(list4);
        keepPet2(list5);
        keepPet2(list6);
        keepPet2(list7);

        keepPet3(list1);
        keepPet3(list2);
        keepPet3(list3);
        keepPet3(list4);
        keepPet3(list5);
        keepPet3(list6);
        keepPet3(list7);


    }

    // 要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet1(ArrayList<? extends Cat> list) {
        list.forEach(cat -> {
            cat.eat();
        });
    }

    // 要求2：该方法能养所有品种的狗，但是不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list) {
        list.forEach(dog -> {
            dog.eat();
        });
    }

    // 要求3：该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list) {
        list.forEach(animal -> {
            animal.eat();
        });
    }
}
