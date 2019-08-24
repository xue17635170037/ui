package com.example.administrator.viewdemo;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button bt_registed;
    private Button bt_open_camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        bt_registed = (Button) findViewById(R.id.bt_registed);
        bt_registed.setOnClickListener(this);
        bt_open_camera = (Button) findViewById(R.id.bt_open_camera);
        bt_open_camera.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_registed:
//                register();
                just();
//                interval();
                break;
            case R.id.bt_open_camera:
                ActivityCompat.requestPermissions(this,permissions,200);
                break;
        }
    }
    private String [] permissions = {
            Manifest.permission.CAMERA,
            Manifest.permission.WRITE_EXTERNAL_STORAGE,
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.RECORD_AUDIO,
    };
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int i = 0; i < grantResults.length; i++) {
            if (grantResults[i] == -1){
                Toast.makeText(this, "请先打开录制视频的权限", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        startActivityForResult(new Intent(this,CameraActivity.class),CameraActivity.CAMERA_RESULT);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 200 && resultCode == 200 && data!=null){
                Log.e("TAG",data.getStringExtra("data"));
        }
    }

    private void register() {
        /**
         * flatMap操作符用于转换
         * 在这里起到的作用是先去注册，然后紧接着再去登录，有序的网络请求
         */
        Observable<RegisterResponse> register = RetrofitClient.Buider.getInstance().register("693833d3d9d3166678c3c9646c4d11e", "yule");
        register.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Action1<RegisterResponse>() {
                    @Override
                    public void call(RegisterResponse registerResponse) {
                        if (registerResponse.getReason().equals("错误的请求KEY")) return;
                    }


                })
                .observeOn(Schedulers.io())
                .flatMap(new Func1<RegisterResponse, Observable<LoginResponse>>() {
                    @Override
                    public Observable<LoginResponse> call(RegisterResponse registerResponse) {
                        return RetrofitClient.Buider.getInstance().login("3189c60700eda0f3ea341374417d8655", "太原");
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<LoginResponse>() {
                    @Override
                    public void call(LoginResponse loginResponse) {
                        Log.i("login", loginResponse.getReason());

                    }
                });
    }

    private void just() {
        /**
         * 并发使用，三秒之后同时出现1-2-3
         * 如果just()里面是三个Observer对象，这样的话，等于是定时去连续请求三个不同的接口
         */
        Observable.just(1, 2, 3).delay(3, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Integer>() {
                    @Override
                    public void call(Integer integer) {
                        Log.e("TAG", integer + "");
                    }
                });
    }

    private void interval() {
        /**
         * 定时使用，每5秒钟会走一次
         */
        Observable.interval(5, TimeUnit.SECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        Log.e("TAG", aLong + "");
                    }
                });
		/**
		*	10代表初始延迟，10秒钟之后开始计时，1代表间隔时间
		*/
//		Observable.interval(10,1,TimeUnit.SECONDS)
//		.subscribe(new Consumer<Long>() {
//			@Override
//			public void accept(Long aLong) throws Exception {
//				Log.e("TAG",aLong+"");
//			}
//		});
    }

}
