package com.liu.mvpstudy.view;

/**
 * 用户View接口
 * Created by liu on 2016/10/28.
 */
public interface IUserView {
    //得到Id
    int getID();
    //得到用户名
    String getUsername();
    //得到密码
    String getPassword();
    //设置用户名
    void setUsername(String Username);
    //设置密码
    void setPassword(String Password);

}
