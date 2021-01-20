package com.practice.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClassTest1 {
    public void stu1(){
        System.out.println("GroupOnClassTest1 stu1 run");
    }
    public void stu2(){
        System.out.println("GroupOnClassTest1 stu2 run");
    }
}
