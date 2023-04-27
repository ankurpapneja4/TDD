package org.javastudent.tdd.utils;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class DemoUtilsTest_LifecycleMethods {

    private DemoUtils demoUtils;

    @BeforeAll
    public static void setupClass(){
        System.out.println("@BeforeAll - Executed before all test and only once");
        System.out.println("I am a static method");
    }

    @AfterAll
    public static void cleanupClassResources(){
        System.out.println("@AfterAll - Executed after all test and only once");
        System.out.println("I am a static method");
    }

    @AfterEach
    @BeforeEach
    public void setupTest(){
        System.out.println("-> Setup test");
        demoUtils = new DemoUtils();
    }

    @AfterEach
    public void releaseResources(){
        demoUtils = null;
        System.out.println("Cleaning up resources after test");
    }

    @Test
    public void test1(){
        System.out.println("Executing test1");
        assertEquals(5,demoUtils.add(3,2));
    }
    
    @Test
    public void test2(){
        System.out.println("Executing test2");
        assertEquals(4,demoUtils.add(2,2));
    }
}
