package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 10:54
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teache1(){
        System.out.println("GroupsOnClass3�е�teache11111111����");
    }
    public void teache2(){
        System.out.println("GroupsOnClass3�е�teache222222222����");
    }

}
