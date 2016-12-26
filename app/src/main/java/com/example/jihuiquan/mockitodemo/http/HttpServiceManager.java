package com.example.jihuiquan.mockitodemo.http;

import com.example.jihuiquan.mockitodemo.common.AppConfig;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 */
public class HttpServiceManager {

    public static Retrofit retrofit;

    public static <T> T getService(Class<T> cls) {
        if (null==retrofit){
            retrofit = new Retrofit.Builder()
                    .baseUrl(AppConfig.BASE_ONLINE_URL)
                    .client(HttpClientManager.getClient())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(cls);
    }

}
