package com.hy.note.test05;

public class Manger extends Employee {
    private double manageBonuses;

    public Manger() {
    }

    public Manger(String id, String name, double salary, double manageBonuses) {
        super(id, name, salary);
        this.manageBonuses = manageBonuses;
    }

    public double getManageBonuses() {
        return manageBonuses;
    }

    public void setManageBonuses(double manageBonuses) {
        this.manageBonuses = manageBonuses;
    }

    @Override
    public void work() {
        super.work();
        System.out.println("经理在管理其他人");
    }
}
