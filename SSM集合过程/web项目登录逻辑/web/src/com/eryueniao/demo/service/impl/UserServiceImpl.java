package com.eryueniao.demo.service.impl;

import com.eryueniao.demo.bean.UserInfo;
import com.eryueniao.demo.dao.UserDao;
import com.eryueniao.demo.dao.impl.UserDaoImpl;
import com.eryueniao.demo.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public boolean login(UserInfo userInfo) {
        //创建DAO层的对象,调用方法
        UserDao userDao = new UserDaoImpl();
        boolean flag = userDao.login(userInfo);
        return flag;
    }
}
