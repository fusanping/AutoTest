package com.course.testng;

import org.testng.annotations.Test;

/**
 * @author fusanping
 * @date 2024��10��21�� 11:14
 */

public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("����һ��ʧ�ܵ��쳣");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("����һ���ɹ����쳣����");
        throw new RuntimeException();

    }
}
