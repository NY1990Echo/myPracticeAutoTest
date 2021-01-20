package com.practice.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher",description = "类分组测试",expectedExceptions = RuntimeException.class)
public class GroupOnClassTest3 {
    public void teacher1(){
        System.out.println("GroupOnClassTest3 teacher1 run");
    }
    public void teacher2(){
        System.out.println("GroupOnClassTest3 teacher2 run");
    }
}
