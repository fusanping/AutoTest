package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024年10月21日 10:39
 */

public class GroupsMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1111111111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法222222222222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法33333333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法44444444444444");
    }
    @BeforeGroups(groups = "server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前的方法");
    }
    @AfterGroups(groups = "server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端组运行之后的方法！！！！！！！！！！！！！！");
    }
    @BeforeGroups(groups = "client")
    public void beforeGroupsOnClien(){
        System.out.println("这是客户端组运行之前的方法");
    }
    @AfterGroups(groups = "client")
    public void afterGroupsOnClien(){
        System.out.println("这是客户端组运行之后的方法！！！！！！！！！！！！！！");
    }
}
