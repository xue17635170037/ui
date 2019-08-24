package com.example.tinker;

import android.content.Context;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

/**
 * Created by Administrator on 2019/08/21.
 */

public class BaseApplication extends MultiDexApplication {
    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //安装分包配置
        MultiDex.install(this);
    }
}
