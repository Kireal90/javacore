package com.kitcenter.app.homework.lesson12;

public class Carnation extends Flower {
    String name = "Carnation";
    int costCarnation = 8;
    @Override
    public int assignCostToFlower () {
        return super.cost = costCarnation;
    }
    @Override
    public String getName() {
        return name;
    }
}
