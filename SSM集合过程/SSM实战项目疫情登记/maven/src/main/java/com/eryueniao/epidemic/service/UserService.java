package com.eryueniao.epidemic.service;

import com.eryueniao.epidemic.bean.UserInfo;

public interface UserService {
    UserInfo login(UserInfo userInfo);
    void enroll( UserInfo userInfo);
}
