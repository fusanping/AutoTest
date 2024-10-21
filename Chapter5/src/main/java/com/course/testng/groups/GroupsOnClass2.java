package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024年10月21日 10:54
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2中的stu1111111运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2中的stu222222222运行");
    }
}
