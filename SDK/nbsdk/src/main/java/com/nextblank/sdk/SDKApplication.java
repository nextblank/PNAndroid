package com.nextblank.sdk;

import android.app.Application;

import com.nextblank.sdk.tools.Tools;

public class SDKApplication extends Application {

    private static SDKApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //Application在此初始化
        Tools.init(this);
    }

    public static SDKApplication getInstance() {
        return instance;
    }
}