package com.example.jihuiquan.mockitodemo.data.hello;


/**
 */
public class HelloDataSourceImpl implements HelloDataSource {

    @Override
    public void getHelloInfo(HelloInfoCallback callback) {

        HelloApiService.getHello(callback);
    }

}
