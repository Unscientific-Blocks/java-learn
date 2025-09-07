package com.hy.work.school.topic;

public class AppleTree extends Plant{
    private String brand;

    public AppleTree(String name, int growTime, int harvestTime, int fruitNum, String brand, Land land, int x, int y) {
        super(name, growTime, harvestTime, fruitNum, land, x, y);
        this.brand = brand;
    }

    @Override
    public void print() {
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("名称:" + getName());
        System.out.println("品牌:" + getBrand());
        System.out.println("剩余生长时间:" + getGrowTime());
        System.out.println("剩余收获时间:" + getHarvestTime());
        System.out.println("果实数量:" + getFruitNum());
        System.out.println("状态:" + getStatus());
        System.out.println("是否能收获:" + getCanHarvest());
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
