package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024Äê10ÔÂ21ÈÕ 12:06
 */

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());

    }
}
