package com.kitcenter.app.classwork.lesson6;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
@RunWith(JUnitParamsRunner.class)
public class DataProviderMathFunctionsTest {
    @Test
    @FileParameters(value = "src/test/resources/testdata.csv", mapper = CsvWithHeaderMapper.class)
     public void dataProviderTestAdd (int argA, int argB, int expOut) {
        int actOut = Math.multiplyExact(argA, argB);
        Assert.assertEquals(expOut, actOut);
    }
}
