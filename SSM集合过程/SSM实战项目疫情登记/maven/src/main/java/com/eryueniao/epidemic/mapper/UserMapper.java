package com.eryueniao.epidemic.mapper;

import com.eryueniao.epidemic.bean.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
    @Select({"SELECT *FROM users WHERE account= #{account} AND  PASSWORD=#{password}"})
    UserInfo login(UserInfo userInfo);
    @Insert("INSERT INTO users(account,password,user_name) VALUES(#{account},#{password},#{userName})")
    void enroll( UserInfo userInfo);
}
