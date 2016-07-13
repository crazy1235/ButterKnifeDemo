package com.jacksen.com.butterknifedemo;

import android.app.Application;

import butterknife.ButterKnife;

/**
 * Created by Admin on 2016/7/13.
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ButterKnife.setDebug(true);
    }
}
