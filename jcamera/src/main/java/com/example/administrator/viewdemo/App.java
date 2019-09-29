package com.example.administrator.viewdemo;

import android.app.Application;

import com.google.gson.Gson;
import com.zhouyou.http.EasyHttp;

import me.jessyan.autosize.AutoSizeConfig;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2019/09/04.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AutoSizeConfig.getInstance().setCustomFragment(true);
        EasyHttp.init(this);
        EasyHttp.getInstance().debug("TAG",true)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()));
    }
}
