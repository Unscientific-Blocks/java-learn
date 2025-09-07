package com.hy.work.school.topic;

public class Corn extends Plant{
    private int plantCost = 2;

    public Corn(String name, int growTime, int harvestTime, int fruitNum, Storehouse s, Land land,int x, int y) {
        super(name, growTime, harvestTime, fruitNum, land, x, y);
        if (s.getApple() < plantCost) {
            System.out.println("苹果不足无法种植");
            super.setName("假");
        } else {
            s.setApple(s.getApple() - plantCost);
        }
    }

    @Override
    public void print() {
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("名称:" + getName());
        System.out.println("种植成本:" + getPlantCost());
        System.out.println("剩余生长时间:" + getGrowTime());
        System.out.println("剩余收获时间:" + getHarvestTime());
        System.out.println("果实数量:" + getFruitNum());
        System.out.println("状态:" + getStatus());
        System.out.println("是否能收获:" + getCanHarvest());
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }

    public double getPlantCost() {
        return plantCost;
    }

    public void setPlantCost(int plantCost) {
        this.plantCost = plantCost;
    }
}
