package com.example.jihuiquan.mockitodemo.data;

import com.example.jihuiquan.mockitodemo.base.BaseResponseModel;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by tight on 2016/6/14.
 */
public interface UserApi {

    @POST("user/proLogin")
    Observable<BaseResponseModel<User>> login(@Query("account") String username, @Query("password") String password);

}
