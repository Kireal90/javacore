package com.kitcenter.app.homework.lesson12;

public abstract class Bicycle {
    public void ride() {
        System.out.println("Wroom!");
    }
    public abstract void  setSpeed(int speed);
    public abstract void setGear(int gear);
}
