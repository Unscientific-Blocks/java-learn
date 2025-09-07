package com.hy.work.school.topic;

public class Test {
    public static void main(String[] args) {
        Storehouse s = new Storehouse(10);
        Land land = new Land(4,4);
        AppleTree a1 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a2 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a3 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a4 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        Corn c1 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c2 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c3 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c4 = new Corn("玉米",100,30,5, s, land, 0, 0);
        AppleTree a5 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a6 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a7 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        AppleTree a8 = new AppleTree("苹果", 100, 20, 10, "联合果品", land,0, 0);
        Corn c5 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c6 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c7 = new Corn("玉米",100,30,5, s, land, 0, 0);
        Corn c8 = new Corn("玉米",100,30,5, s, land, 0, 0);
        //Corn c9 = new Corn("玉米",100,30,5, s, land, 0, 0);
        land.print();
    }
}
