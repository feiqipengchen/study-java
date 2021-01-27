package com.eryueniao.service.impl;


import com.eryueniao.dao.UserDao;
import com.eryueniao.dao.impl.UserDaoImpl;
import com.eryueniao.service.UserService;

//服务层的实现类
public class UserServiceImpl implements UserService {
    @Override
    public void jdbcMethod(String username, String password) {
        //使用多态形式创建对象
        UserDao userDao = new UserDaoImpl();
        userDao.jdbcMethod(username,password);
    }
}
