package com.test.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 22:06
 */

public class TestMethodsDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("���������Լ�д����־");
        throw new RuntimeException("���������Լ��������쳣");
    }
}
