package com.liu.mvpstudy.presenter;

import com.liu.mvpstudy.bean.UserBean;
import com.liu.mvpstudy.model.IUserModel;
import com.liu.mvpstudy.model.UserModel;
import com.liu.mvpstudy.view.IUserView;

/**
 * 用户presenter
 * View和Model之间的桥梁，view通过presenter获取数据，设置数据
 * Created by liu on 2016/10/28.
 */
public class UserPresenter {
    private IUserModel userModel;
    private IUserView userView;

    public UserPresenter(IUserView userView) {
        this.userView = userView;
        userModel=new UserModel();
    }

    public void saveUser(int id, String username, String password) {
        userModel.setID(id);
        userModel.setUsername(username);
        userModel.setPassword(password);
    }

    public void loadUser(int id) {
        UserBean user = userModel.loadUser(id);
        userView.setUsername(user.getUsername());
        userView.setPassword(user.getPassword());
    }
}
