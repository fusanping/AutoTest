package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024Äê10ÔÂ21ÈÕ 11:24
 */

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest(String name ,int age){
        System.out.println("name= "+name+",age ="+age);
    }
}
