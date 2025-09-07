package com.hy.work.school.topic;

import java.util.Random;

public class Plant {
    private String name;        //名称
    private int growTime;       //剩余生长时间(不小于零) 幼苗到成年 一次性
    private int harvestTime;    //剩余收获时间(不小于零) 成年到结果 可重复(收获后果实数量变0 重新结果)
    private int fruitNum;       //果实数量(不小于零) 结果前 0   结果后 1 - 10
    private String status;      //状态 1 幼苗(剩余生长时间大于零 && 不可收获)   2 成年(剩余生长时间为零 && 剩余收获时间大于零 开始结果)   3 已结果(剩余生长时间为零 && 剩余收获时间大于零 )
    private boolean canHarvest; //是否能收获 能(成年 && 剩余收获时为零)

    public Plant(String name, int growTime, int harvestTime, int fruitNum, Land land, int x, int y) {
        setGrowTime(growTime);
        setHarvestTime(harvestTime);
        setFruitNum(fruitNum);
        setStatus();
        setCanHarvest();
        setName(name);
        if (land.getNullPlace() == -1) {
            return;
        }
        System.out.println("ooo" + this.name);
        if (x < land.getLength() && x >= 0 && y < land.getWidth() && y >= 0 && land.getPlants()[x][y] == null) {
            land.plant(this, x, y);
        } else {
            land.plant(this, land.getNullPlace() / land.getLength(), land.getNullPlace() % land.getWidth());
        }
    }


    public void print() {
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("名称:" + getName());
        System.out.println("剩余生长时间:" + getGrowTime());
        System.out.println("剩余收获时间:" + getHarvestTime());
        System.out.println("果实数量:" + getFruitNum());
        System.out.println("状态:" + getStatus());
        System.out.println("是否能收获:" + getCanHarvest());
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }

    public void harvest(Storehouse s) {
        if (canHarvest) {
            Random r = new Random();
            int harvestTime = r.nextInt(100) + 1;
            System.out.println("已收获" + this.fruitNum + "个果实,距下次收获还有" + harvestTime + "个单位时间");
            s.addFruit(this);
            this.fruitNum = 0;
            this.canHarvest = false;
            this.harvestTime = harvestTime;
            setStatus();
        } else {
            System.out.println("还未结果,无法收获");
        }
    }

    public void grow(int time) {
        Random r = new Random();
        if (this.status.equals("幼苗")) {
            if (time < this.growTime) {
                this.growTime -= time;
                System.out.println("幼苗 -> 幼苗");
            } else if (time >= this.growTime && time < this.growTime + this.harvestTime) {
                System.out.println("幼苗 -> 成年");
                this.harvestTime -= (time - this.growTime);
                this.growTime = 0;
            } else {
                this.growTime = 0;
                this.harvestTime = 0;
                setFruitNum(r.nextInt(10) + 1);
                System.out.println("幼苗 -> 成年 -> 已结果(" + this.fruitNum + "个)");
            }
        } else if (this.status.equals("成年")) {
            if (time < this.harvestTime) {
                System.out.println("成年 -> 成年");
                this.harvestTime -= time;
            } else {
                this.harvestTime = 0;
                setFruitNum(r.nextInt(10) + 1);
                System.out.println("成年 -> 已结果(" + this.fruitNum + "个)");
            }
        } else if (this.status.equals("已结果")) {
            System.out.println("已结果 -> 已结果(" + this.fruitNum + "个)");
        }
        setStatus();
        setCanHarvest();
    }

    public boolean getCanHarvest() {
        return canHarvest;
    }

    public void setCanHarvest() {
        if (fruitNum > 0) {
            canHarvest = true;
        } else {
            canHarvest = false;
        }
    }

    public int getFruitNum() {
        return fruitNum;
    }

    public void setFruitNum(int fruitNum) {
        if (this.growTime == 0 && this.harvestTime == 0 && this.fruitNum == 0) {
            if (fruitNum < 0) {
                this.fruitNum = 0;
            } else if (fruitNum > 10) {
                this.fruitNum = 10;
            } else {
                this.fruitNum = fruitNum;
            }
        }
    }

    public int getGrowTime() {
        return growTime;
    }

    public void setGrowTime(int growTime) {
        if (growTime < 0) {
            this.growTime = 0;
        } else if (growTime > 100) {
            this.growTime = 0;
        } else {
            this.growTime = growTime;
        }
    }

    public int getHarvestTime() {
        return harvestTime;
    }

    public void setHarvestTime(int harvestTime) {
        if (harvestTime < 0) {
            this.harvestTime = 0;
        } else if (harvestTime > 100) {
            this.harvestTime = 100;
        } else {
            this.harvestTime = harvestTime;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if (name.equals("彩蛋")) {
            this.growTime = 0;
            this.harvestTime = 0;
            this.fruitNum = 999999;
            this.canHarvest = true;
            this.status = "已结果";
        } else if (name.equals("假")) {
            this.growTime = -1;
            this.harvestTime = -1;
            this.fruitNum = -1;
            this.canHarvest = false;
            this.status = "假";
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        if (this.growTime > 0) {
            this.status = "幼苗";
        } else if (this.growTime == 0 && this.harvestTime > 0) {
            this.status = "成年";
        } else if (this.growTime == 0 && this.harvestTime == 0 && this.fruitNum > 0) {
            this.status = "已结果";
        }
    }
}
