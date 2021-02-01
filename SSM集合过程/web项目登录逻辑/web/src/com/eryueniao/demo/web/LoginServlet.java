package com.eryueniao.demo.web;

import com.eryueniao.demo.bean.UserInfo;
import com.eryueniao.demo.service.UserService;
import com.eryueniao.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 页面的跳转有两种方式:
 * 请求转发:一次请求,数据可以存到request对象中进行传递,只能在当前服务器内部进行跳转,地址栏地址不会发生变化
 * 重定向:两次请求,数据不可以存到request对象中,应该存到session中,可以跳转到其他服务器的资源中,地址栏地址发生变化
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    //服务器提供的相应post请求的方法
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("doPost");
        //从请求中获取请求参数的值(输入框中的值)
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        //封装数据
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount(account);
        userInfo.setPassword(password);

        //创建服务层的对象调用服务层的方法
        UserService userService = new UserServiceImpl();
        boolean flag = userService.login(userInfo);
        if (flag) {
            //跳转首页页面两种方法
            //1.请求转发:
//            request.setAttribute("loginedUser", userInfo.getAccount());
//            request.getRequestDispatcher("/main.jsp").forward(request, response);
            //2.重定向
            HttpSession session = request.getSession();
            session.setAttribute("loginedUser", userInfo.getAccount());
            response.sendRedirect(request.getContextPath() + "/main.jsp");//request.getContextPath()获取虚拟路径
        } else {

            //跳转到登录页面
            //请求转发:
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            //重定向
            //response.sendRedirect(request.getContextPath()+"/login.jsp");
        }
    }

    //服务器提供的相应get请求的方法
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // this.doPost(request, response);
        System.out.println("doGet");
//        String account = request.getParameter("account");
//        System.out.println(account);
    }
}
