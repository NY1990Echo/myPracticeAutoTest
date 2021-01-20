package com.practice.testng;

import org.testng.annotations.*;

public class Coupon {
    @Test(groups = "groupTest")
    public void test1(){
        System.out.printf("执行test1");
    }
    @Test(groups = "groupTest2",enabled = true)
    public void test2(){
        System.out.println("执行test2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("执行test2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("执行beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("执行afterMethod");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("执行beforeClass");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("执行afterClass");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("执行beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("执行afterSuite");
    }
    @BeforeGroups("groupTest")
    public void beforeGroups(){
        System.out.println("执行beforeGroups");
    }
    @AfterGroups({"groupTest","groupTest2"})
    public void afterGroups(){
        System.out.println("执行afterGroups");
    }
}
