package com.eryueniao.epidemic.service.impl;

import com.eryueniao.epidemic.bean.UserInfo;
import com.eryueniao.epidemic.mapper.UserMapper;
import com.eryueniao.epidemic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 如果要纳入spring容器的类，不属于框架的任何一层，就加@Component
 * 如果该类属于框架中的视图层(控制层)，加@controller
 * 如果该类属于服务层，加@Service
 * 如果该类属于持久层，@Repository/@Mapper
 * 以上注解都可以通用
 */
@Service//将该类与实现类纳入spring容器的管理
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public UserInfo login(UserInfo userInfo) {
       UserInfo loginedUser= userMapper.login(userInfo);
        return loginedUser;
    }

    @Override
    public void enroll(UserInfo userInfo) {
        userMapper.enroll(userInfo);
    }
}
