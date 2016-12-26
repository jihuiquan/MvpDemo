package com.example.jihuiquan.mockitodemo.data;


import com.example.jihuiquan.mockitodemo.http.BaseHttpManager;
import com.example.jihuiquan.mockitodemo.http.HttpServiceManager;

/**
 * Created by tight on 2016/6/14.
 */
public class UserApiService {

    private static UserApi userApi;

    private synchronized static UserApi getUserService() {
        if (null == userApi) {
            userApi = HttpServiceManager.getService(UserApi.class);
        }
        return userApi;
    }

    public static void userLogin(String username, String password, UserLoginDataSource.UserLoginCallback callback) {
        BaseHttpManager.executeHttp(getUserService().login(username, password), callback);
    }
}
