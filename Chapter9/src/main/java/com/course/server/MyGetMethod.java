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
 * @date 2024年10月30日 16:24
 */
@RestController
@Api(value ="/",description = "这是我全部的get方法")
public class MyGetMethod {
    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    @ApiOperation(value = "通过这个方法可以获取到cookies",httpMethod = "GET")
    public String getCookies(HttpServletResponse response){
        //HttpServerletRequest  装请求信息的类
        //HttpServerletResponse 装响应信息的类
        Cookie cookie = new Cookie("login", "true");
        response.addCookie(cookie);
        return "恭喜你获得cookie成功";
    }
    /*
     要求客户端携带cookie访问
     */
    @RequestMapping(value = "/get/with/cookies",method = RequestMethod.GET)
    @ApiOperation(value = "要求客户端携带cookie访问",httpMethod = "GET")
    public  String getWithCookies(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        if (Objects.isNull(cookies)){
            return "必须携带cookie信息访问";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")&&cookie.getValue().equals("true")){
                return "恭喜你访问成功";
            }
        }
        return "必须携带cookie信息访问";
    }
    /*
     * 开发一个需要携带参数才能访问的get请求
     * 第一种实现方式 url：key=value&key=value
     * 我们来模拟获取商品列表
     */
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "需要携带参数才能访问的get请求的方法一",httpMethod = "GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                        @RequestParam Integer end){
        Map<String, Integer> myList = new HashMap<>();
        myList.put("鞋",400);
        myList.put("干脆面",2);
        myList.put("衬衫",221);
        return myList;
    }
    /*
     第二种需要携带参数访问的get请求
     url：ip：port/get/with/param/10/20
     */
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "需要携带参数才能访问的get请求的方法二",httpMethod = "GET")
    public Map myGetList(@PathVariable Integer start,
                         @PathVariable Integer end){
        Map<String, Integer> myList = new HashMap<>();
        myList.put("鞋",400);
        myList.put("干脆面",2);
        myList.put("衬衫",221);
        return myList;
    }
}
