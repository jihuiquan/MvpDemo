package com.example.jihuiquan.mockitodemo.data;

import android.support.annotation.NonNull;

import com.example.jihuiquan.mockitodemo.base.BaseCallback;
import com.example.jihuiquan.mockitodemo.base.BaseResponseModel;


/**
 */
public interface UserLoginDataSource {

    abstract class UserLoginCallback implements BaseCallback<BaseResponseModel<User>> {
        @Override
        public void onCompleted() {
        }

        @Override
        public void onError(Throwable e) {
            e.printStackTrace();
            onLoginFailed(e.getMessage());
        }

        @Override
        public void onNext(BaseResponseModel<User> user) {
            if (user.getStatus() == 200) {
                onLoginSucceed(user.getData());
            } else {
                onLoginFailed(user.getMessage());
            }
        }

        public abstract void onLoginSucceed(User user);

        public abstract void onLoginFailed(String msg);
    }

    void login(@NonNull String username, @NonNull String password, UserLoginCallback callback);
}
