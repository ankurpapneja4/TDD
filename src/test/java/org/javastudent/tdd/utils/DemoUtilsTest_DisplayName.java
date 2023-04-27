package org.javastudent.tdd.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DemoUtilsTest_DisplayName {

    private DemoUtils demoUtils;

    @BeforeEach
    public void setup(){
        demoUtils = new DemoUtils();
    }


    @DisplayName("Test - add Operation ")
    @Test
    public void test1(){
        Assertions.assertEquals(6,demoUtils.add(1,5));
    }
}
