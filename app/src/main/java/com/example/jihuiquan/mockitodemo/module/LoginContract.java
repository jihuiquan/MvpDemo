package com.example.jihuiquan.mockitodemo.module;

public interface LoginContract {
    interface View  {
        void loginSucceed(String msg);
        void loginFailedAndShowMsg(String msgId);
    }

    interface Presenter  {
        void login(String username, String password);
        void getHelloInfo();
    }
}
