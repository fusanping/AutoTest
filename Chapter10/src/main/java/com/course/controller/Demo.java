package com.course.controller;

import com.course.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author fusanping 
 * @date 2024��10��31�� 15:18 
 */
 @Log4j
 @RestController
 @Api(value = "v1",description = "�����ҵ�һ���汾��demo")
 @RequestMapping("v1")
public class Demo {
     //���Ȼ�ȡһ��ִ��sql���Ķ���
    @Autowired
    private SqlSessionTemplate template;
    @RequestMapping(value = "/getUserCount",method = RequestMethod.GET)
    @ApiOperation(value = "���Ի�ȡ���û���",httpMethod = "GET")
    public int getUserCount(){
        return  template.selectOne("getUserCount");

    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public int addUser(@RequestBody User user){
        return template.insert("addUser",user);
    }
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(@RequestBody User user){
       return template.update("updateUser",user);
    }
    @RequestMapping(value = "/deleteUser",method = RequestMethod.GET)
    public int delUser(@RequestParam int id){
        return template.delete("deleteUser",id);
    }

}
