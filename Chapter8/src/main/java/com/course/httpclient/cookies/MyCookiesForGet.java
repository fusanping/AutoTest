package com.course.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author fusanping
 * @date 2024��10��24�� 20:12
 */

public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    //�����洢cookie��Ϣ�ı���
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
         bundle = ResourceBundle.getBundle("application", Locale.CHINA);
         url=bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //�������ļ���ƴ�Ӳ���url
        String uri = bundle.getString("getCookies.uri");
        String testUrl= this.url+uri;
        //�����߼�������д
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);
        //��ȡcookies��Ϣ
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();
        for (Cookie cookie:cookieList){
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println("cookie name="+name+";");
            System.out.println("cookie value="+value+";");
        }
    }
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String uri=bundle.getString("test.get.with.cookies");
        String testUrl= this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        //����cookies��Ϣ
        client.setCookieStore(this.store);
        HttpResponse response = client.execute(get);
        //��ȡ��Ӧ��״̬��
        int statusCode=response.getStatusLine().getStatusCode();
        System.out.println("statusCode"+statusCode);
        if (statusCode==200){
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(result);
            //��ȡcookies��Ϣ
        }
    }
}
