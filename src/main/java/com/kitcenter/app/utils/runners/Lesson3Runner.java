package com.kitcenter.app.utils.runners;

import com.kitcenter.app.utils.convertors.PrimitiveConvertor;

public class Lesson3Runner {
    public static void main(String[] args) {
        PrimitiveConvertor primConv = new PrimitiveConvertor();
        primConv.floatToChar();
        primConv.intToChar();
        primConv.charToInt();

    }
}
