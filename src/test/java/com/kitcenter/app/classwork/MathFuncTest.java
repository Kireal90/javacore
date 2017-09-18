package com.kitcenter.app.classwork;

import com.kitcenter.app.classwork.lesson5.MathFunc;
        import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test // JUnit framework annotation
    public void multiplyTest() {
        int a = 1, b = 2, expRes = 2;
        Assert.assertEquals(expRes, MathFunc.multiply(a, b));
    }
}