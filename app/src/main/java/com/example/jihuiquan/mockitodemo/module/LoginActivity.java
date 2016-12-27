package com.example.jihuiquan.mockitodemo.module;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.jihuiquan.mockitodemo.R;
import com.example.jihuiquan.mockitodemo.data.hello.HelloDataSourceImpl;

/**
 * Created by jihuiquan on 2016/12/26.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    private EditText account;
    private EditText passworid;
    private LoginContract.Presenter loginPresenter;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginPresenter = new LoginPresenter(this, new HelloDataSourceImpl());
        account = (EditText) findViewById(R.id.account);
        passworid = (EditText) findViewById(R.id.password);
        findViewById(R.id.login_bt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            loginPresenter.getHelloInfo();
// loginPresenter.login(account.getText().toString().trim(), MD5Util.getMd5(passworid.getText().toString().trim()));
            }
        });

    }

    @Override
    public void loginSucceed(String msg) {
        Log.d(TAG, "loginSucceed() called with: msg = [" + msg + "]");
    }

    @Override
    public void loginFailedAndShowMsg(String msgId) {
        Log.d(TAG, "loginFailedAndShowMsg() called with: msgId = [" + msgId + "]");
    }
}
