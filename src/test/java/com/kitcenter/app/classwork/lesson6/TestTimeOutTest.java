package com.kitcenter.app.classwork.lesson6;

import org.junit.Test;

public class TestTimeOutTest {
    @Test(timeout=1000)
    public void infinityTest() {
        while(true){}
    }
}
