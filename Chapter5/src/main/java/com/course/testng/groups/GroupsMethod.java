package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 10:39
 */

public class GroupsMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("���Ƿ������Ĳ��Է���1111111111111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("���Ƿ������Ĳ��Է���222222222222222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("���ǿͻ�����Ĳ��Է���33333333333333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("���ǿͻ�����Ĳ��Է���44444444444444");
    }
    @BeforeGroups(groups = "server")
    public void beforeGroupsOnServer(){
        System.out.println("���Ƿ����������֮ǰ�ķ���");
    }
    @AfterGroups(groups = "server")
    public void afterGroupsOnServer(){
        System.out.println("���Ƿ����������֮��ķ�������������������������������");
    }
    @BeforeGroups(groups = "client")
    public void beforeGroupsOnClien(){
        System.out.println("���ǿͻ���������֮ǰ�ķ���");
    }
    @AfterGroups(groups = "client")
    public void afterGroupsOnClien(){
        System.out.println("���ǿͻ���������֮��ķ�������������������������������");
    }
}
