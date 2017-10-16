package com.kitcenter.app.homework.lesson12;

public class Rose extends Flower {
    String name = "Rose";
    int costRose = 10;
    @Override
    public int assignCostToFlower () {
       return super.cost = costRose;
    }
    @Override
    public String getName() {
        return name;
    }
}
