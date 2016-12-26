package com.example.jihuiquan.mockitodemo.base;

/**
 */
public interface BaseCallback<T> {
    void onCompleted();
    void onError(Throwable e);
    void onNext(T t);
}
