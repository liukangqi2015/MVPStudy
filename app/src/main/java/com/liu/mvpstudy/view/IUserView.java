package com.liu.mvpstudy.view;

/**
 * 用户View接口
 * Created by liu on 2016/10/28.
 */
public interface IUserView {
    int getID();

    String getUsername();

    String getPassword();

    void setUsername(String Username);

    void setPassword(String Password);

}
