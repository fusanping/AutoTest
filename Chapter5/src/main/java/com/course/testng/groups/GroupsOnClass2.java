package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 10:54
 */
@Test(groups = "stu")
public class GroupsOnClass2 {
    public void stu1(){
        System.out.println("GroupsOnClass2�е�stu1111111����");
    }
    public void stu2(){
        System.out.println("GroupsOnClass2�е�stu222222222����");
    }
}
