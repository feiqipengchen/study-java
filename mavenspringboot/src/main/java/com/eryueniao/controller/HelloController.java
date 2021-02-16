package com.eryueniao.controller;


import com.eryueniao.bean.UserInfo;
import com.eryueniao.mapper.UserMapper;
import com.eryueniao.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*
{@Controller只返回页面。显示用@RestController返回JSON格式的数据}
 */
@RestController
public class HelloController {
    @Autowired
    UserMapper userMapper;
    @Autowired
    service service1;

    @RequestMapping("/Hello")
    public String Hello() {
        int i = 2 / 0;
        return "Hello";
    }

//    @RequestMapping("/getUser")
//    public UserInfo getUser(Integer id) {
//        System.out.println("123--------------------------------");
//        return userMapper.login(id);
//    }

    @RequestMapping("/getUser1")
    public UserInfo getUser1(Integer id) {
        System.out.println("123--------------------------------");
        return service1.tranfor(id);
    }
}
