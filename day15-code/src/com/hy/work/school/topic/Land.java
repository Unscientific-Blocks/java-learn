package com.hy.work.school.topic;

public class Land {
    private Plant[][] plants;
    private int landNum;
    private int length;
    private int width;

    public Land(int length,int width) {
        plants = new Plant[length][width];
        this.length = length;
        this.width = width;
        landNum = length * width;
    }

    public void plant(Plant plant, int x, int y) {
        plants[x][y] = plant;
    }

    public void print() {
        for (int i = 0; i < plants.length; i++) {
            for (int j = 0; j < plants[i].length; j++) {
                if (plants[i][j] != null) {
                    System.out.print(plants[i][j].getName() + " ");
                } else {
                    System.out.print("空 ");
                }
            }
            System.out.println();
        }
    }

    public int getNullPlace(){
        for (int i = 0; i < landNum; i++) {
            if (plants[i / length][i % width] == null){
                return i;
            }
        }
        return -1;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getLandNum() {
        return landNum;
    }

    public Plant[][] getPlants() {
        return plants;
    }
}
