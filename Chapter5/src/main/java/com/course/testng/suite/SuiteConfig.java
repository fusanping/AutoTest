package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author fusanping
 * @date 2024��10��19�� 11:46
 */

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit������");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit������");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}