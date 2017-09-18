package com.kitcenter.app.homework;

import org.junit.Assert;
import org.junit.Test;

public class Lesson5TwentyMethodsTest {

    @Test
    public void additionMethodTest (){
        int numberOne =15;
        int numberTwo = 15;
        int expected = 30;
        int actual = Lesson5TwentyMethods.additionMethod(numberOne, numberTwo);
        Assert.assertEquals(expected,actual );

    }
    @Test
    public void divisionMethodTest (){
        int numberOne = 10;
        int numberTwo = 10;
        int expected = 1;
        int actual = Lesson5TwentyMethods.divisionMethod(numberOne, numberTwo);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void vKvadrateTest() {
        int valueInit = 10;
        int expected = 100;
        int actual = Lesson5TwentyMethods.vKvadrate(valueInit);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void divideOnItselfTest () {
        int initValueTest = 100;
        int expected = 1;
        int actual = Lesson5TwentyMethods.divideOnItself(initValueTest);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void korenKvadratnuyTest() {
        int initValue = 100;
        int expected = 10;
        int actual = Lesson5TwentyMethods.korenKvadratnuy(initValue);
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void multipyOn25Test(){
        int initValue = 850;
        int expected = 850*25;
        int actual = Lesson5TwentyMethods.multipyOn25(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void vKubeTest() {
        int initValue = 2;
        int expected = 8;
        int actual = Lesson5TwentyMethods.vKube(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void devideOn2Test () {
        int initValue = 4;
        int expected = 2;
        int actual = Lesson5TwentyMethods.devideOn2(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void devideOn25Test () {
        int initValue = 16000;
        int expected = initValue/25;
        int actual = Lesson5TwentyMethods.devideOn25(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void devideOn5Test () {
        int initValue = 1000;
        int expected = 1000/5;
        int actual = Lesson5TwentyMethods.devideOn5(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void plusHalfTest () {
        int initValue = 9000;
        int expected = 9000+9000/2;
        int actual = Lesson5TwentyMethods.plusHalf(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void plusHalfAndAgainPlusHalfTest () {
        int initValue = 100;
        int firstIter = 100 + 100/2;
        int expected = firstIter + firstIter/2;
        int actual = Lesson5TwentyMethods.plusHalfAndAgainPlusHalf(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void plusOneTest () {
        int initValue = 10;
        int expected = 11;
        int actual = Lesson5TwentyMethods.plusOne(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void kvadratPluskvadratTest () {
        int initValue = 10;
        int expected = 10*10+10*10;
        int actual = Lesson5TwentyMethods.kvadratPluskvadrat(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void valuePlusValueDevideOn2Test () {
        int initValue = 10;
        int expected = (10+10)/2;
        int actual = Lesson5TwentyMethods.valuePlusValueDevideOn2(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void valueMinus100Test () {
        int initValue = 10;
        int expected = 10 - 100;
        int actual = Lesson5TwentyMethods.valueMinus100(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void addTwoValuesVKvadrateTest () {
        int firstValue = 10;
        int secondValue = 5;
        int expected = firstValue*firstValue+secondValue*secondValue;
        int actual = Lesson5TwentyMethods.addTwoValuesVKvadrate(firstValue, secondValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void plus10Test () {
        int initValue = 100;
        int expected = 100+10;
        int actual = Lesson5TwentyMethods.plus10(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void devidedOn2AndAdd100Test () {
        int initValue = 10;
        int expected = 10/2+100;
        int actual = Lesson5TwentyMethods.devidedOn2AndAdd100(initValue);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void devideOneOnValueTest () {
        int initValue = 2;
        int expected = 1000000/initValue;
        int actual = Lesson5TwentyMethods.devideOneMillionOnValue(initValue);
        Assert.assertEquals(expected, actual);
    }

}
