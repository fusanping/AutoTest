package com.course.testng;


import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 10:20
 */

public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1ִ��");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2ִ��");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3ִ��");
    }
}
