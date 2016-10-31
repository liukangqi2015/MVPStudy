package com.liu.mvpstudy.model;

import android.util.SparseArray;

import com.liu.mvpstudy.bean.UserBean;

/**
 * 用户Model实现类
 * Created by liu on 2016/10/28.
 */
public class UserModel implements IUserModel{
    private String Username;
    private String Password;
    private int mID;
    private SparseArray<UserBean> mUsererArray = new SparseArray<UserBean>();
    @Override
    public void setID(int id) {
        mID=id;
    }

    @Override
    public void setUsernaem(String Username) {
        this.Username=Username;
    }

    @Override
    public void setPassword(String Password) {
        this.Password=Password;
        UserBean userBean=new UserBean(Username,this.Password);
        mUsererArray.append(mID,userBean);
    }

    @Override
    public UserBean loadUser(int id) {
        mID=id;
        UserBean userBean=mUsererArray.get(id,new UserBean("not found","not found"));
        return userBean;
    }
}
