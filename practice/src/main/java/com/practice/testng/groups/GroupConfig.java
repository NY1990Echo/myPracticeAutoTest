package com.practice.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;

public class GroupConfig {
    @BeforeGroups("stu")
    public void beforeGroups(){
        System.out.println("beforeGroups stu run");
    }
    @AfterGroups("stu")
    public void afterGroups(){
        System.out.println("afterGroups stu run");
    }
}
