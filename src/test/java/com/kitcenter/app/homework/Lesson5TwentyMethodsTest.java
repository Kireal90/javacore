package com.kitcenter.app.homework;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(JUnitParamsRunner.class)
public class Lesson5TwentyMethodsTest {


    @Test
    @FileParameters(value = "src/test/resources/additionMethodTest.csv", mapper = CsvWithHeaderMapper.class)
        public void additionMethodTest (int val1, int val2, int exp){
//        int numberOne =15;
//        int numberTwo = 15;
//        int expected = 30;
        int actual = Lesson5TwentyMethods.additionMethod(val1, val2);
        Assert.assertEquals(exp,actual );

    }
    @Test
    @FileParameters(value = "src/test/resources/divisionMethodTest.csv", mapper = CsvWithHeaderMapper.class)
    public void divisionMethodTest (int val1, int val2, int exp){
        int actual = Lesson5TwentyMethods.divisionMethod(val1, val2);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/vKvadrateTest.csv", mapper = CsvWithHeaderMapper.class)
    public void vKvadrateTest(int val1, int exp) {
        int actual = Lesson5TwentyMethods.vKvadrate(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/divideOnItselfTest.csv", mapper = CsvWithHeaderMapper.class)
    public void divideOnItselfTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.divideOnItself(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/korenKvadratnuyTest.csv", mapper = CsvWithHeaderMapper.class)
    public void korenKvadratnuyTest(int val1, int exp) {
        int actual = Lesson5TwentyMethods.korenKvadratnuy(val1);
        Assert.assertEquals(exp, actual);

    }
    @Test
    @FileParameters(value = "src/test/resources/multipyOn25Test.csv", mapper = CsvWithHeaderMapper.class)
    public void multipyOn25Test(int val1, int exp){
        int actual = Lesson5TwentyMethods.multipyOn25(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/vKubeTest.csv", mapper = CsvWithHeaderMapper.class)
    public void vKubeTest(int val1, int exp) {
        int actual = Lesson5TwentyMethods.vKube(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/devideOn2Test.csv", mapper = CsvWithHeaderMapper.class)
    public void devideOn2Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.devideOn2(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/devideOn25Test.csv", mapper = CsvWithHeaderMapper.class)
    public void devideOn25Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.devideOn25(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/devideOn5Test.csv", mapper = CsvWithHeaderMapper.class)
    public void devideOn5Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.devideOn5(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/plusHalfTest.csv", mapper = CsvWithHeaderMapper.class)
    public void plusHalfTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.plusHalf(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/plusHalfAndAgainPlusHalfTest.csv", mapper = CsvWithHeaderMapper.class)
    public void plusHalfAndAgainPlusHalfTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.plusHalfAndAgainPlusHalf(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/plusOneTest.csv", mapper = CsvWithHeaderMapper.class)
    public void plusOneTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.plusOne(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/kvadratPluskvadratTest.csv", mapper = CsvWithHeaderMapper.class)
    public void kvadratPluskvadratTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.kvadratPluskvadrat(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/valuePlusValueDevideOn2Test.csv", mapper = CsvWithHeaderMapper.class)
    public void valuePlusValueDevideOn2Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.valuePlusValueDevideOn2(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/valueMinus100Test.csv", mapper = CsvWithHeaderMapper.class)
    public void valueMinus100Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.valueMinus100(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/addTwoValuesVKvadrateTest.csv", mapper = CsvWithHeaderMapper.class)
    public void addTwoValuesVKvadrateTest (int val1, int val2, int exp) {
        int actual = Lesson5TwentyMethods.addTwoValuesVKvadrate(val1, val2);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/plus10Test.csv", mapper = CsvWithHeaderMapper.class)
    public void plus10Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.plus10(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/devidedOn2AndAdd100Test.csv", mapper = CsvWithHeaderMapper.class)
    public void devidedOn2AndAdd100Test (int val1, int exp) {
        int actual = Lesson5TwentyMethods.devidedOn2AndAdd100(val1);
        Assert.assertEquals(exp, actual);
    }
    @Test
    @FileParameters(value = "src/test/resources/devideOneMillionOnValueTest.csv", mapper = CsvWithHeaderMapper.class)
    public void devideOneMillionOnValueTest (int val1, int exp) {
        int actual = Lesson5TwentyMethods.devideOneMillionOnValue(val1);
        Assert.assertEquals(exp, actual);
    }

}
