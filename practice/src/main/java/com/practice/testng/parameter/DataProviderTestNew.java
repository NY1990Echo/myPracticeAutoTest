package com.practice.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class DataProviderTestNew {
    @Test(dataProvider = "dataProviderMethod")
    public void test1(String stuName,int stuAge){
        System.out.printf("test1 run."+"stuName is："+stuName+";stuAge is"+stuAge);
    }
    @Test(dataProvider = "dataProviderMethod")
    public void test2(String stuName,int stuAge){
        System.out.printf("test2 run"+"stuName is："+stuName+";stuAge is"+stuAge);
    }

    @DataProvider(name = "dataProviderMethod")
    public Object[][] dataProviderMethod(Method method){
        Object[][] o = null;
        if (method.getName().equals("test1")){
            o = new Object[][]{
                    {"zhangsan",10}
            };
        }else if (method.getName().equals("test2")){
            o = new Object[][]{
                    {"lisi",20}
            };
        }
        return o;
    }
}
