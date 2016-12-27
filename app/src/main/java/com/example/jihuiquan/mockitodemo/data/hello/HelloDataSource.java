package com.example.jihuiquan.mockitodemo.data.hello;

import com.example.jihuiquan.mockitodemo.base.BaseCallback;


/**
 */
public interface HelloDataSource {

    abstract class HelloInfoCallback implements BaseCallback<HelloInfo> {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable e) {
            e.printStackTrace();
            onLoginFailed(e.getMessage());
        }

        @Override
        public void onNext(HelloInfo user) {
                onLoginSucceed(user.toString());
        }

        public abstract void onLoginSucceed(String user);

        public abstract void onLoginFailed(String msg);
    }

    void getHelloInfo(HelloInfoCallback callback);
}
