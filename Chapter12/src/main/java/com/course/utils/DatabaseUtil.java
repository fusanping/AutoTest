package com.course.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author fusanping
 * @date 2024��11��04�� 23:14
 */

public class DatabaseUtil {
    public static SqlSession getSqlSession() throws IOException {
        //��ȡ���õ��ļ���Դ
        Reader reader = Resources.getResourceAsReader("databaseConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
        //sqlSession�����ܹ�ִ�������ļ��е�sql���
        SqlSession sqlSession = factory.openSession();
        return sqlSession;
    }
}
