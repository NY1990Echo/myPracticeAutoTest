package com.practice.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeTest(){
        System.out.println("RunTimeException异常测试成功");
        throw new RuntimeException();
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeTestFailed(){
        System.out.println("RunTimeException异常测试失败");
    }
}
