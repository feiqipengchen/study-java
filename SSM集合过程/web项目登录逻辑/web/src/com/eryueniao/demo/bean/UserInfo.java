package com.eryueniao.demo.bean;
//与数据库中的users表对应
/*
1.成员变量要私有
2.成员变量的数据类型与数据库要对应
3.成员变量的名称与数据库中的字段要对应
 */
// alt + insert     快速生成构造方法与setter和getter方法
public class UserInfo {
    private Integer userId;
    private String account;
    private String password;
    private String userName;
    private Integer delFlag;

    public UserInfo() {
    }

    public UserInfo(Integer userId, String account, String password, String userName, Integer delFlag) {
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.userName = userName;
        this.delFlag = delFlag;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", delFlag=" + delFlag +
                '}';
    }
}
