package com.hy.work.school.topic;

public class Storehouse {
    private int apple;
    private int corn;

    public Storehouse(int apple) {
        setApple(apple);
        setCorn(corn);
    }

    public void addFruit(Plant plant) {
        if (plant instanceof AppleTree appleTree) {
            setApple(getApple() + appleTree.getFruitNum());
        } else if (plant instanceof Corn corn) {
            setCorn(getCorn() + corn.getFruitNum());
        }
    }

    public void show() {
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        System.out.println("苹果:" + getApple());
        System.out.println("玉米:" + getCorn());
        System.out.println("~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
    }

    public int getApple() {
        return apple;
    }

    public void setApple(int apple) {
        if (apple < 0) {
            this.apple = 0;
        } else if (apple > 100000) {
            this.apple = 100000;
        } else {
            this.apple = apple;
        }
    }

    public int getCorn() {
        return corn;
    }

    public void setCorn(int corn) {
        if (corn < 0) {
            this.corn = 0;
        } else if (corn > 100000) {
            this.corn = 100000;
        } else {
            this.corn = corn;
        }
    }
}
