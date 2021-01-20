package com.practice.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"studentName","studentAge"})
    public void paramTest(String studentName,int studentAge){
        System.out.println("学生姓名是："+studentName+";学生年纪是："+studentAge);
    }
}
