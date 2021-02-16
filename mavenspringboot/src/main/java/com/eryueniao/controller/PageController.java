package com.eryueniao.controller;

import com.eryueniao.bean.UserInfo;
import com.eryueniao.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PageController {

    @RequestMapping("/index")
    public  String Hello(Model model){
        model.addAttribute("name","顿启鹏");
        ArrayList<String>a=new ArrayList<String>();
        a.add("123");
        a.add("456");
        //a.add(new User("eryueniao","123"));
        model.addAttribute("a",a);
        return "index";
    }

}
