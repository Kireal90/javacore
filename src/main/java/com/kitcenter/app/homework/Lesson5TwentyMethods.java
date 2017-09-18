package com.kitcenter.app.homework;

public class Lesson5TwentyMethods {

    public static int additionMethod (int numberOne, int numberTwo){
        return numberOne+numberTwo;
    }
    public static int divisionMethod (int numberOne, int numberTwo) {
        return numberOne/numberTwo;
    }
    public static int vKvadrate (int multiplyOnItself) {
        return multiplyOnItself*multiplyOnItself;
    }
    public static int divideOnItself (int initValue) {
        return initValue/initValue;
    }
    public static int korenKvadratnuy (int initValue) {
        int result = (int)Math.sqrt(initValue);
        return result;
    }
    public static int multipyOn25 (int initValue) {
        return initValue*25;
    }
    public static int vKube (int initValue) {
        return initValue*initValue*initValue;
    }
    public static int devideOn2 (int initValue) {
        return initValue/2;
    }
    public static int devideOn25 (int initValue) {
        return initValue/25;
    }
    public static int devideOn5(int initValue) {
        return initValue/5;
    }
    public static int plusHalf (int initValue) {
        int result = initValue +initValue/2;
        return result;
    }
    public static int plusHalfAndAgainPlusHalf (int initValue) {
        int firstTimePlusHalf = initValue+initValue/2;
        int result = firstTimePlusHalf+firstTimePlusHalf/2;
        return result;
    }
    public static int plusOne (int initValue) {
        return initValue+1;
    }
    public static int kvadratPluskvadrat (int initValue) {
        return initValue*initValue + initValue*initValue;
    }
    public static int valuePlusValueDevideOn2 (int initValue) {
        return (initValue+initValue)/2;
    }
    public static int valueMinus100 (int initValue) {
        return initValue-100;
    }
    public static int addTwoValuesVKvadrate (int firstValue,int secondValue ) {
    return firstValue*firstValue + secondValue*secondValue;
    }
    public static int plus10 (int initValue) {
        return initValue+10;
    }
    public static int devidedOn2AndAdd100 (int initValue) {
        return initValue/2+100;
    }
    public static int devideOneMillionOnValue (int initValue) {
        return 1000000/initValue;
    }
}
