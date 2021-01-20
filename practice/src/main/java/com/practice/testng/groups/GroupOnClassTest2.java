package com.practice.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClassTest2 {
    @Test(enabled = false)
    public void stu1(){
        System.out.println("GroupOnClassTest2 stu1 run");
    }
    public void stu2(){
        System.out.println("GroupOnClassTest2 stu2 run");
    }
}
