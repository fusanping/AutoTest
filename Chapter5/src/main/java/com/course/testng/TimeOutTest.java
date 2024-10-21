package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024Äê10ÔÂ21ÈÕ 12:41
 */

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {


        Thread.sleep(3000);
    }
}
