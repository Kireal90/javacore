package com.kitcenter.runners.classwork.lesson14;

import com.kitcenter.app.classwork.lesson14.ACMEBicycle;
import com.kitcenter.app.classwork.lesson14.Bicycle;

public class ClassworkLesson14BicycleRunner {
    public static void main(String[] args) {
        Bicycle acme = new ACMEBicycle();
        ClassworkLesson14BicycleRunner.executeMethods(acme);

    }
    public static void executeMethods (Bicycle bic) {
        bic.changeCadence(2);
        bic.changeGear(2);
        System.out.println(bic.changeSpeed(10));
    }
}
