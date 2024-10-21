package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author fusanping
 * @date 2024年10月21日 11:45
 */

public class DataProvide {
    @Test(dataProvider = "data")
    public void testDataProvide(String name, int age) {
        System.out.println("name= " + name + ",age =" + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"李四", 15},
                {"wangwu", 23},
                {"zoujun", 31}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test11111111方法的name= " + name + ",age =" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2222222方法的name= " + name + ",age =" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"刘涵", 36},
                    {"孙权", 40}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"赵六", 39},
                    {"吴三", 80}
            };

        }
        return result;

    }
}
