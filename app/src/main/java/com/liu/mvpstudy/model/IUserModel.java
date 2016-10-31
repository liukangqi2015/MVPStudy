package com.liu.mvpstudy.model;

import com.liu.mvpstudy.bean.UserBean;

/**
 * 用户Model接口
 * Created by liu on 2016/10/28.
 */
public interface IUserModel {
    void setID(int id);
    void setUsernaem(String Username);
    void setPassword(String password);
    UserBean loadUser(int id);
}
