package com.example.jihuiquan.mockitodemo.module;

import com.example.jihuiquan.mockitodemo.data.hello.HelloDataSource;

/**
 * Created by jihuiquan on 2016/12/26.
 */

public class LoginPresenter implements LoginContract.Presenter{
    private final LoginContract.View view;
    private HelloDataSource loginService;

    public LoginPresenter(LoginContract.View view,HelloDataSource loginService){
        this.view = view;
        this.loginService = loginService;

    }

    public void login(String account, String password){
//        loginService.login(account, password, new UserLoginDataSource.UserLoginCallback() {
//            @Override
//            public void onLoginSucceed(User user) {
//                view.loginSucceed(user.toString());
//            }
//
//            @Override
//            public void onLoginFailed(String msg) {
//                view.loginFailedAndShowMsg(msg);
//            }
//        });
    }

    @Override
    public void getHelloInfo() {
        loginService.getHelloInfo(new HelloDataSource.HelloInfoCallback() {
            @Override
            public void onLoginSucceed(String user) {
                view.loginSucceed(user);
            }

            @Override
            public void onLoginFailed(String msg) {
                view.loginFailedAndShowMsg(msg);
            }
        });

    }
}
