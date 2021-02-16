package com.eryueniao.service.impl;

import com.eryueniao.bean.UserInfo;
import com.eryueniao.mapper.UserMapper;
import com.eryueniao.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServiceImpl implements service {
    @Autowired
    UserMapper userMapper;

    @Override
    @Transactional
    public UserInfo tranfor(int id) {
        return userMapper.selectById(id);
    }
}
