package com.example.administrator.viewdemo;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2019/08/16.
 */

public interface RetrofitClient {
    class Buider{
        public static RetrofitClient getInstance(){
            return HttpUtil.getInstance().create(RetrofitClient.class);
        }
    }
    @GET("toutiao/index?")
    Observable<RegisterResponse>register(@Query("key")String key,@Query("type")String type);

    @GET("weather/index?")
    Observable<LoginResponse>login(@Query("key")String key,@Query("cityname")String cityname);
}
