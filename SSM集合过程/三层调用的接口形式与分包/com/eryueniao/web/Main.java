package com.eryueniao.web;


import com.eryueniao.service.UserService;
import com.eryueniao.service.impl.UserServiceImpl;

import java.util.Scanner;

/**
 * 数据的获取与调用Service层
 */
public class Main {
    public static void main(String[] args) {
        //数据的准备
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.next();
        System.out.println("请输入密码:");
        String password = scanner.next();

        UserService userService = new UserServiceImpl();
        userService.jdbcMethod(username,password);
    }
}
