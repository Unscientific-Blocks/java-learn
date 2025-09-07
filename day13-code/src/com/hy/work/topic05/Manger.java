package com.hy.work.topic05;

public class Manger extends Employee {
    private double bonus;

    public Manger() {
    }

    public Manger(String name, double salary, String workId, double bonus) {
        super(name, salary, workId);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("经理在管理");
    }
}
