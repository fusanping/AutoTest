package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024年10月21日 10:54
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teache1(){
        System.out.println("GroupsOnClass3中的teache11111111运行");
    }
    public void teache2(){
        System.out.println("GroupsOnClass3中的teache222222222运行");
    }

}
