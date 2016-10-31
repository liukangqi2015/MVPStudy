package com.liu.mvpstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.liu.mvpstudy.presenter.UserPresenter;
import com.liu.mvpstudy.view.IUserView;

public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
    private EditText id_et,username_et,password_et;
    private Button save_btn,get_btn;
    private UserPresenter mUserPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUserPresenter=new UserPresenter(this);
        initView();
        setListener();
    }

    private void initView() {
        id_et=(EditText) findViewById(R.id.id_et);
        username_et=(EditText) findViewById(R.id.username_et);
        password_et=(EditText)findViewById(R.id.password_et);
        save_btn=(Button) findViewById(R.id.save_btn);
        get_btn=(Button) findViewById(R.id.get_btn);
    }

    private void setListener(){
        save_btn.setOnClickListener(this);
        get_btn.setOnClickListener(this);
    }

    @Override
    public int getID() {
        return Integer.parseInt(id_et.getText().toString());
    }

    @Override
    public String getUsername() {
        return username_et.getText().toString();
    }

    @Override
    public String getPassword() {
        return password_et.getText().toString();
    }

    @Override
    public void setUsername(String Username) {
        username_et.setText(Username);
    }

    @Override
    public void setPassword(String Password) {
        password_et.setText(Password);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.save_btn:
                mUserPresenter.saveUser(getID(),getUsername(),getPassword());
                break;
            case R.id.get_btn:
                mUserPresenter.loadUser(getID());
                break;
        }
    }
}
