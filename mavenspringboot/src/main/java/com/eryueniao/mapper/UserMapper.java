package com.eryueniao.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.eryueniao.bean.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Mapper
//@Repository
public interface UserMapper extends BaseMapper<UserInfo> {
//    @Select("SELECT *FROM users WHERE user_id=#{arg0}")
//    UserInfo login(@Param("arg0") int id);
//    @Insert("INSERT INTO users(account,password,user_name) VALUES(#{account},#{password},#{userName})")
//    void enroll(UserInfo userInfo);
}
