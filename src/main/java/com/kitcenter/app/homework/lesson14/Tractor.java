package com.kitcenter.app.homework.lesson14;

public class Tractor extends Mashine {

    public void getTransportName ( String transName) {
        System.out.println("Transport name: "+transName);
    }
    public void getSpeed(int speed) {
        System.out.println("Speed: "+speed);
    }
    public void getWeight (int weight) {
        System.out.println("Weight: "+weight);
    }

    @Override
    public void getQuantityPassengers(int pass) {
        System.out.println("Passengers: "+pass);
    }

    @Override
    public void getQuantityOfWheels(int wheels) {
        System.out.println("Wheels: "+wheels);
    }
    public Tractor (String transName, int speed, int weight, int pass, int wheels) {
        getTransportName(transName);
        getSpeed(speed);
        getWeight(weight);
        getQuantityPassengers(pass);
        getQuantityOfWheels(wheels);
    }
}

