package com.kitcenter.app.homework.lesson12;

public class Magnolia extends Flower {
    String name = "Magnolia";
    int costMagnolia = 7;
    @Override
    public int assignCostToFlower () {
        return super.cost = costMagnolia;
    }
    @Override
    public String getName() {
        return name;
    }
}
