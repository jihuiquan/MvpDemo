package com.example.jihuiquan.mockitodemo.module;

import com.example.jihuiquan.mockitodemo.data.User;
import com.example.jihuiquan.mockitodemo.data.UserLoginDataSource;

/**
 * Created by jihuiquan on 2016/12/26.
 */

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;
    private UserLoginDataSource loginService;

    public LoginPresenter(LoginContract.View view,UserLoginDataSource  loginService){
        this.view = view;
        this.loginService = loginService;

    }

    public void login(String account, String password){
        loginService.login(account, password, new UserLoginDataSource.UserLoginCallback() {
            @Override
            public void onLoginSucceed(User user) {
                view.loginSucceed(user.toString());
            }

            @Override
            public void onLoginFailed(String msg) {
                view.loginFailedAndShowMsg(msg);
            }
        });
    }
}
