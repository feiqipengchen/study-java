package com.eryueniao.bean;

public class UserInfo {
    private Integer user_id;
    private String account;
    private String password;
    private String user_name;
    private Integer del_flag;

    public UserInfo() {
    }

    public UserInfo(Integer user_id, String account, String password, String user_name, Integer del_flag) {
        this.user_id = user_id;
        this.account = account;
        this.password = password;
        this.user_name = user_name;
        this.del_flag = del_flag;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(Integer del_flag) {
        this.del_flag = del_flag;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "user_id=" + user_id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", user_name='" + user_name + '\'' +
                ", del_flag=" + del_flag +
                '}';
    }
}
