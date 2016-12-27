package com.example.jihuiquan.mockitodemo.data.hello;


import com.example.jihuiquan.mockitodemo.http.BaseHttpManager;
import com.example.jihuiquan.mockitodemo.http.HttpServiceManager;

/**
 */
public class HelloApiService {

    private static HelloApi userApi;

    private synchronized static HelloApi getUserService() {
        if (null == userApi) {
            userApi = HttpServiceManager.getService(HelloApi.class);
        }
        return userApi;
    }

    public static void getHello( HelloDataSource.HelloInfoCallback callback) {
        BaseHttpManager.executeHttp(getUserService().getHelloInfo(), callback);
    }
}
