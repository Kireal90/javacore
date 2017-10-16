package com.kitcenter.runners.homework.lesson12;

import com.kitcenter.app.homework.lesson12.Computer;
import com.kitcenter.app.homework.lesson12.DELL;
import com.kitcenter.app.homework.lesson12.Lenovo;

public class HometaskLesson12ComputerRunner {
    public static void main(String[] args) {


        Lenovo lenovo = new Lenovo();
        DELL DELL = new DELL();
        Computer [] computerArray = new Computer[2];
        computerArray[0] = DELL;
        computerArray[1] = lenovo;
        HometaskLesson12ComputerRunner.changesForComputers(computerArray[0]);
        HometaskLesson12ComputerRunner.changesForComputers(computerArray[1]);

    }
    public static void changesForComputers(Computer comp) {
        comp.changeCPU();
    }
}