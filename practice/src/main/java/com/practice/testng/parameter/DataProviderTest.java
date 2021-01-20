package com.practice.testng.parameter;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
    @Test(dataProvider = "stuData")
    public void testDataProvider(String studentName,int studentAge){
        System.out.print("学生姓名是："+studentName+"；学生年纪是："+studentAge);

    }

    @DataProvider(name = "stuData")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
}
