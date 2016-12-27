package com.example.jihuiquan.mockitodemo.data.hello;

import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by jihuiquan on 2016/12/27.
 */

public interface HelloApi {
    @POST("/go")
    Observable<HelloInfo> getHelloInfo();
}
