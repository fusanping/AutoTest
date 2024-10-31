package com.course.server;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author fusanping
 * @date 2024��10��30�� 16:24
 */
@RestController
@Api(value ="/",description = "������ȫ����get����")
public class MyGetMethod {
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "ͨ������������Ի�ȡ��cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServerletRequest  װ������Ϣ����
        //HttpServerletResponse װ��Ӧ��Ϣ����
        Cookie cookie = new Cookie("login", "true");
        response.addCookie(cookie);
        return "��ϲ����cookie�ɹ�";
    }
    /*
     Ҫ��ͻ���Я��cookie����
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "Ҫ��ͻ���Я��cookie����",httpMethod = "GET")
    public  String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "����Я��cookie��Ϣ����";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "��ϲ����ʳɹ�";
            }
        }
        return "����Я��cookie��Ϣ����";
    }
    /*
     * ����һ����ҪЯ���������ܷ��ʵ�get����
     * ��һ��ʵ�ַ�ʽ url��key=value&key=value
     * ������ģ���ȡ��Ʒ�б�
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "��ҪЯ���������ܷ��ʵ�get����ķ���һ",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                        @RequestParam Integer end){
        Map<String, Integer> myList = new HashMap<>();
        myList.put("Ь",400);
        myList.put("�ɴ���",2);
        myList.put("����",221);
        return myList;
    }
    /*
     �ڶ�����ҪЯ���������ʵ�get����
     url��ip��port/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "��ҪЯ���������ܷ��ʵ�get����ķ�����",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String, Integer> myList = new HashMap<>();
        myList.put("Ь",400);
        myList.put("�ɴ���",2);
        myList.put("����",221);
        return myList;
    }
}
