package com.liu.mvpstudy.bean;

/**
 * 用户实体类
 * Created by liu on 2016/10/28.
 */
public class UserBean {
    private String username;
    private String password;

    public UserBean(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
