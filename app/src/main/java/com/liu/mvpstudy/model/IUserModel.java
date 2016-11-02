package com.liu.mvpstudy.model;

import com.liu.mvpstudy.bean.UserBean;

/**
 * 用户Model接口
 * Created by liu on 2016/10/28.
 */
public interface IUserModel {
    //设置id
    void setID(int id);
    //设置用户名
    void setUsername(String Username);
    //设置密码
    void setPassword(String password);
    //根据ID得到用户实例
    UserBean loadUser(int id);
}
