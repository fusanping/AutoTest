package com.course.testng;


import org.testng.annotations.*;

/**
 * @author fusanping
 * @date 2024��10��19�� 10:46
 */

public class BasicAnnotation {
    //�������ע�⣬�����ѷ������Ϊ���Ե�һ����
    @Test
    public  void testCase1(){
        System.out.println("Test���ǲ�������1");
    }
    @Test
    public  void testCase2(){
        System.out.println("Test���ǲ�������2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod�����ڲ��Է���ִ��ǰ����");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod�����ڲ��Է���ִ�к�����");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass������������ǰ���еķ���");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass������������֮�����еķ���");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite�׼�");
    }
    @AfterSuite
    public void aferSuite(){
        System.out.println("AfterSuite�׼�");
    }
}
