package com.eryueniao.epidemic.controler;

import com.eryueniao.epidemic.bean.UserInfo;
import com.eryueniao.epidemic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller//该注解表示当前类被springMVC框架管理
@RequestMapping("/user")//该注解就是给当前类绑定一个请求路径
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(UserInfo userInfo, Model model, HttpSession session) {
        UserInfo loginedUser = userService.login(userInfo);
        if (loginedUser != null) {
            //System.out.println("登陆成功！"+loginedUser);
            //登录成功，记录用户的登陆状态
            session.setAttribute("loginedUser", loginedUser);
            //重定向跳转页面
            return "redirect:/main.jsp";
        } else {
            //System.out.println("登录失败！");
            //请求转发跳转页面
            //跳转到/login.jsp
            model.addAttribute("msg", "用户名或密码有误");
            return "login";
        }
    }

    @RequestMapping("/enroll")
    public String enroll(UserInfo userInfo, Model model) {
        UserInfo loginedUser = userService.login(userInfo);
        if (loginedUser == null) {
            userService.enroll(userInfo);
            return "redirect:/login.jsp";
        } else {
            //System.out.println("登录失败！");
            //请求转发跳转页面
            //跳转到/login.jsp
            model.addAttribute("msg", "注册失败，注册信息有误，或者该账号已存在，请重新注册");
            return "enroll";
        }

    }

    @RequestMapping("logout")
    public String Logout(HttpSession session) {
        session.removeAttribute("loginedUser");
//session.invalidate();//移除所有的键值对
        return "login";
    }
}
