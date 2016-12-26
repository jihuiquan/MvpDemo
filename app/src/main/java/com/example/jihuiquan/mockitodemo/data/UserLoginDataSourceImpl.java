package com.example.jihuiquan.mockitodemo.data;

import android.support.annotation.NonNull;

import static com.google.gson.internal.$Gson$Preconditions.checkNotNull;

/**
 * Created by tight on 2016/6/13.
 */
public class UserLoginDataSourceImpl implements UserLoginDataSource {

    @Override
    public void login(@NonNull String username, @NonNull String password, UserLoginCallback callback) {
        checkNotNull(username);

        UserApiService.userLogin(username, password, callback);
    }

}
