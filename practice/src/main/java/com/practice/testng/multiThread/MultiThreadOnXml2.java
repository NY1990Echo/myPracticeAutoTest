package com.practice.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml2 {
    @Test
    public void test1(){
        System.out.printf("MultiThreadOnXml2 test1 run,thread id is:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("MultiThreadOnXml2 test2 run,thread id is:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("MultiThreadOnXml2 test3 run,thread id is:%s%n",Thread.currentThread().getId());
    }
}
