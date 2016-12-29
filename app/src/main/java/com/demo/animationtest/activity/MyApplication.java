package com.demo.animationtest.activity;

import android.app.Application;
import android.content.Context;
import android.provider.Settings;


/**
 * Application基类
 * Created by shixiaoming on 16/12/6.
 */

public class MyApplication extends Application{

    private static Context mContext;

    @Override public void onCreate() {
        super.onCreate();
//        Fresco.initialize(this);//Fresco初始化
        MyApplication.mContext = getApplicationContext();
    }

    public static Context getAppContext() {
        return MyApplication.mContext;
    }

    public static String getAndroidId() {
        return Settings.Secure.getString(
                getAppContext().getContentResolver(), Settings.Secure.ANDROID_ID);
    }
}
