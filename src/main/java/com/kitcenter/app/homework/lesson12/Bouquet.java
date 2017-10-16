package com.kitcenter.app.homework.lesson12;


public class Bouquet extends Flower {

    public Bouquet (Flower oneType, Flower secondType) {
        int one = oneType.assignCostToFlower();
        int two = secondType.assignCostToFlower();
        int result = one + two;
        String oneName = oneType.getName();
        String secName = secondType.getName();
        System.out.println("Bouquet consists of two types of flowers: "+oneName+" and "+
                secName+"\nCost of bouquet is: " + result);
        System.out.println("");
    }
}
