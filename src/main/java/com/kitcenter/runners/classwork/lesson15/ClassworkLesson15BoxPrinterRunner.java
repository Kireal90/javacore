package com.kitcenter.runners.classwork.lesson15;

import com.kitcenter.app.classwork.lesson15.BoxPrinter;

public class ClassworkLesson15BoxPrinterRunner {
    public static void main(String[] args) {
        BoxPrinter<String> strVal = new BoxPrinter<String>(new String("String"));
        System.out.println(strVal);
    }
}
