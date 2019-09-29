package com.example.administrator.viewdemo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;

import com.cjt2325.cameralibrary.JCameraView;

public class CameraActivity extends AppCompatActivity {

    private JCameraView cameraview;
    public static final int CAMERA_RESULT = 200;
    public static final String CAMERA_EXTRAS = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 19) {
            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        } else {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(option);
        }
        setContentView(R.layout.activity_camera);
        initView();
    }

    @Override
    protected void onResume() {
        cameraview.onResume();
        super.onResume();
    }

    @Override
    protected void onPause() {
        cameraview.onPause();
        super.onPause();
    }

    private void initView() {
        cameraview = (JCameraView) findViewById(R.id.cameraview);
        cameraview.setSaveVideoPath(Environment.getExternalStorageDirectory().getPath()); //(0.0.8+)设置手动/自动对焦，默认为自动对焦
        cameraview.setAutoFoucs(false);
        cameraview.setCameraViewListener(new JCameraView.CameraViewListener() {
            @Override
            public void quit() {
                //返回按钮的点击时间监听
                CameraActivity.this.finish();
            }
            @Override
            public void captureSuccess(Bitmap bitmap) {
                //获取到拍照成功后返回的Bitmap
                if (bitmap == null)return;
                Uri uri = Uri.parse(MediaStore.Images.Media.insertImage(getContentResolver(), bitmap, null, null));
                Intent intent = new Intent();
                intent.putExtra(CAMERA_EXTRAS,uri);
                setResult(CAMERA_RESULT,intent);
                finish();
            }
            @Override
            public void recordSuccess(String url) {
                if (TextUtils.isEmpty(url)){
                    return;
                }
                //获取成功录像后的视频路径
                Intent intent = new Intent();
                Uri parse = Uri.parse(url);
                intent.putExtra(CAMERA_EXTRAS, parse);
                setResult(CAMERA_RESULT,intent);
                finish();
            }
        });
    }

}
