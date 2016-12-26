package com.example.jihuiquan.mockitodemo.base;

/**
 * Created by tight on 2016/6/15.
 */
public interface BaseCallback<T> {
    void onCompleted();
    void onError(Throwable e);
    void onNext(T t);
}
