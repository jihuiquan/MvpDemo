package com.example.jihuiquan.mockitodemo.http;

import android.util.Log;

import com.example.jihuiquan.mockitodemo.base.BaseCallback;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 */
public class BaseHttpManager {

    public static <T> void executeHttp(Observable<T> observable, final BaseCallback<T> callback) {
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .unsubscribeOn(Schedulers.io())
                .subscribe(new Subscriber<T>() {
                    @Override
                    public void onStart() {
                        Log.d("Network=============", "Start");
                    }

                    @Override
                    public void onCompleted() {
                        callback.onCompleted();
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(e);
                    }

                    @Override
                    public void onNext(T t) {
                        callback.onNext(t);
                    }
                });
    }

}
