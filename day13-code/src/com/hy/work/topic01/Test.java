package com.hy.work.topic01;

public class Test {
    public static void main(String[] args) {
        Buyer buyer = new Buyer("001", "maizhe", "采购");
        buyer.work();
        Lecturer lecturer = new Lecturer("002", "Youyou", "讲课");
        lecturer.work();
    }
}
