package org.javastudent.tdd.utils;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
public class DemoUtilsTest_DisplayNameGenerator {

    private DemoUtils demoUtils;

    @BeforeEach
    public void setup(){
        demoUtils = new DemoUtils();
    }


    @Test
    public void test1(){
        Assertions.assertEquals(6,demoUtils.add(1,5));
    }
}
