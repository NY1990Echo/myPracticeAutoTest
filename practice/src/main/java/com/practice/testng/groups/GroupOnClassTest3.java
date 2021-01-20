package com.practice.testng;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupOnClassTest3 {
    public void teacher1(){
        System.out.println("GroupOnClassTest3 teacher1 run");
    }
    public void teacher2(){
        System.out.println("GroupOnClassTest3 teacher2 run");
    }
}
