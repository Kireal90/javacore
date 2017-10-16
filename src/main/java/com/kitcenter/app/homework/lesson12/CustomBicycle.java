package com.kitcenter.app.homework.lesson12;

public class CustomBicycle extends Bicycle {
    int speed;
    int gear;
    @Override
    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println(this.speed);
    }
    @Override
    public void setGear(int gear) {
        this.gear = gear;
        System.out.println(this.gear);
    }
    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }
}