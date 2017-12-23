package com.caitou.baidudemo;

import android.app.Application;

import com.baidu.mapapi.SDKInitializer;

/**
 * @author Guangzhao Cai
 * @className:
 * @classDescription:
 * @createTime: 2017-12-23
 */
public class AppContext extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //在使用SDK各组件之前初始化context信息，传入ApplicationContext
        //注意该方法要再setContentView方法之前实现
        SDKInitializer.initialize(getApplicationContext());
    }
}
