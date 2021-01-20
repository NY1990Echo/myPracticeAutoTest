package com.practice.testng.annotation;
import org.testng.annotations.*;

public class AnnotationTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod run");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod run");
    }
}
