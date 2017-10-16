package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.BicycleWithRing;
import com.kitcenter.app.homework.lesson12.CustomBicycle;

public class HometaskLesson12BicycleRunner {
    public static void main(String[] args) {
        BicycleWithRing bwithring = new BicycleWithRing();
        bwithring.ring();
        CustomBicycle custBike = new CustomBicycle();
        custBike.setGear(11);
        custBike.ride();
    }
}
