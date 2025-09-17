package com.hy.work.topic01;

import java.util.ArrayList;

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
        
        PersianCat pc1 = new PersianCat("波斯猫1号", 2);
        PersianCat pc2 = new PersianCat("波斯猫2号", 3);
        ArrayList<PersianCat> persianCats = new ArrayList<>();
        persianCats.add(pc1);
        persianCats.add(pc2);
        
        TanukiCat tc1 = new TanukiCat("狸花猫1号", 3);
        TanukiCat tc2 = new TanukiCat("狸花猫2号", 2);
        ArrayList<TanukiCat> tanukiCats = new ArrayList<>();
        tanukiCats.add(tc1);
        tanukiCats.add(tc2);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(tc1);
        cats.add(tc2);
        cats.add(pc1);
        cats.add(pc2);


        TeddyDog td1 = new TeddyDog("泰迪1号", 4);
        TeddyDog td2 = new TeddyDog("泰迪2号", 5);
        ArrayList<TeddyDog> teddyDogs = new ArrayList<>();
        teddyDogs.add(td1);
        teddyDogs.add(td2);
        
        HuskyDog hd1 = new HuskyDog("哈士奇1号", 5);
        HuskyDog hd2 = new HuskyDog("哈士奇2号", 4);
        ArrayList<HuskyDog> huskyDogs = new ArrayList<>();
        huskyDogs.add(hd1);
        huskyDogs.add(hd2);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(td1);
        dogs.add(td2);
        dogs.add(hd1);
        dogs.add(hd2);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(tc1);
        animals.add(tc2);
        animals.add(pc1);
        animals.add(pc2);
        animals.add(td1);
        animals.add(td2);
        animals.add(hd1);
        animals.add(hd2);
        
//        keepPet1(persianCats);
//        keepPet1(tanukiCats);
        keepPet2(dogs);
        keepPet3(animals);
        keepPet3(dogs);
    }
    
    //要求1：该方法能养所有品种的猫，但是不能养狗
    public static void keepPet1(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            if (cat instanceof PersianCat pc) {
                pc.eat();
            } else if (cat instanceof TanukiCat tc) {
                tc.eat();
            }
        }
    }
    
    //要求2：该方法能养所有品种的狗，但是不能养猫
    public static void keepPet2(ArrayList<? extends Dog> list) {
        for (Dog dog : list) {
            dog.eat();
        }
    }
    
    //要求3：该方法能养所有的动物，但是不能传递其他类型
    public static void keepPet3(ArrayList<? extends Animal> list) {
        for (Animal animal : list) {
            animal.eat();
        }
    }
}
