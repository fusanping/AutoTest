package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024年10月21日 11:14
 */

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();

    }
}
