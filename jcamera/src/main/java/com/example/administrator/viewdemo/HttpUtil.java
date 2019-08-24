package com.example.administrator.viewdemo;

import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2019/08/16.
 */

public class HttpUtil {

    public static Retrofit getInstance(){
        return new Retrofit.Builder()
                .baseUrl("http://v.juhe.cn/")
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
