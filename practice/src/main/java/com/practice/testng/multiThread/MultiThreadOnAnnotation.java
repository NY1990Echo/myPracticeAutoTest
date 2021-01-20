package com.practice.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {
    @Test(invocationCount = 2,threadPoolSize = 2)
    public void test(){
        System.out.printf("test run,thread id is:%s\n",Thread.currentThread().getId());
    }
}
