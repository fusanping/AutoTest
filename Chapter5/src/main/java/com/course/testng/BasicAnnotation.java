package com.course.testng;


import org.testng.annotations.*;

/**
 * @author fusanping
 * @date 2024年10月19日 10:46
 */

public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public  void testCase1(){
        System.out.println("Test这是测试用例1");
    }
    @Test
    public  void testCase2(){
        System.out.println("Test这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod这是在测试方法执行前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是在测试方法执行后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass这是在类运行前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass这是在类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite套件");
    }
    @AfterSuite
    public void aferSuite(){
        System.out.println("AfterSuite套件");
    }
}
