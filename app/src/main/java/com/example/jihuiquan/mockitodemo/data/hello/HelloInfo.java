package com.example.jihuiquan.mockitodemo.data.hello;

/**
 * Created by jihuiquan on 2016/12/27.
 */

public class HelloInfo {

    /**
     * text : Hello World
     */

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {

        return "我的Hello字符串：：：：："+getText();
    }
}
