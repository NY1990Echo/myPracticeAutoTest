package com.practice.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("MultiThreadOnXml test1 run,thread id is:%s\n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("MultiThreadOnXml test2 run,thread id is:%s\n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("MultiThreadOnXml test3 run,thread id is:%s\n",Thread.currentThread().getId());
    }
}
