package com.practice.testng.parameter;

import org.testng.annotations.*;

public class DataProvider {
    @Test(dataProvider = "stuData")
    public void testDataProvider(String studentName,int studentAge){
        System.out.println("学生姓名是："+studentName+"；学生年纪是："+studentAge);

    }

    @org.testng.annotations.DataProvider(name = "stuData")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
}
