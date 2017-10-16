package com.kitcenter.runners.classwork.lesson13;

import com.kitcenter.app.classwork.lesson13.Car;
import com.kitcenter.app.classwork.lesson13.Engine;

public class Lesson13ClassworkRunner {
    public static void main(String[] args) {
        Engine v12 = new Engine();
        v12.setName("v12");
        Car bmw = new Car();
        bmw.setEngine(v12);
        System.out.println(bmw.getEngine().getName());

    }
}
