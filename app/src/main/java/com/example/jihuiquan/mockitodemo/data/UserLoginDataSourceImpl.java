package com.example.jihuiquan.mockitodemo.data;

import android.support.annotation.NonNull;

import static com.google.gson.internal.$Gson$Preconditions.checkNotNull;

/**
 */
public class UserLoginDataSourceImpl implements UserLoginDataSource {

    @Override
    public void login(@NonNull String username, @NonNull String password, UserLoginCallback callback) {
        checkNotNull(username);

        UserApiService.userLogin(username, password, callback);
    }

}
