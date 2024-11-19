package com.course.cases;

import com.course.config.TestConfig;
import com.course.model.InterfaceName;
import com.course.model.LoginCase;
import com.course.utils.ConfigFile;
import com.course.utils.DatabaseUtil;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.apache.ibatis.session.SqlSession;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * @author fusanping
 * @date 2024��11��04�� 23:19
 */

public class LoginTest {
    @BeforeTest(groups = "loginTrue",description = "����׼������,��ȡHttpClient����")
    public void beforeTest(){
        TestConfig.defaultHttpClient = new DefaultHttpClient();
        TestConfig.getUserInfoUrl = ConfigFile.getUrl(InterfaceName.GETUSERINFO);
        TestConfig.getUserListUrl = ConfigFile.getUrl(InterfaceName.GETUSERLIST);
        TestConfig.loginUrl = ConfigFile.getUrl(InterfaceName.LOGIN);
        TestConfig.updateUserInfoUrl = ConfigFile.getUrl(InterfaceName.UPDATEUSERINFO);
        TestConfig.addUserUrl = ConfigFile.getUrl(InterfaceName.ADDUSERINFO);
    }
    @Test(groups = "loginTrue",description = "�û��ɹ���½�ӿ�")
    public void loginTrue() throws IOException {

        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",0);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);

        //�±ߵĴ���Ϊд��ӿڵĲ��Դ���
        String result = getResult(loginCase);
        //�������������жϷ��ؽ���Ƿ����Ԥ��
        Assert.assertEquals(loginCase.getExpected(),result);


    }

    @Test(description = "�û���½ʧ�ܽӿ�")
    public void loginFalse() throws IOException {
        SqlSession session = DatabaseUtil.getSqlSession();
        LoginCase loginCase = session.selectOne("loginCase",1);
        System.out.println(loginCase.toString());
        System.out.println(TestConfig.loginUrl);



        //�±ߵĴ���Ϊд��ӿڵĲ��Դ���
        String result = getResult(loginCase);
        //�������������жϷ��ؽ���Ƿ����Ԥ��
        Assert.assertEquals(loginCase.getExpected(),result);

    }




    private String getResult(LoginCase loginCase) throws IOException {
        //�±ߵĴ���Ϊд��ӿڵĲ��Դ���
        HttpPost post = new HttpPost(TestConfig.loginUrl);
        JSONObject param = new JSONObject();
        param.put("userName",loginCase.getUserName());
        param.put("password",loginCase.getPassword());
        //��������ͷ��Ϣ ����header
        post.setHeader("content-type","application/json");
        //��������Ϣ��ӵ�������
        StringEntity entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        //����һ��������������Ӧ����Ĵ洢
        String result;
        //ִ��post����
        HttpResponse response = TestConfig.defaultHttpClient.execute(post);
        //��ȡ��Ӧ���
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        TestConfig.store = TestConfig.defaultHttpClient.getCookieStore();
        return result;
    }
}
