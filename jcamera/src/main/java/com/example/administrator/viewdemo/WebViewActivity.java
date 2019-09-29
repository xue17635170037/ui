package com.example.administrator.viewdemo;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.zhouyou.http.EasyHttp;
import com.zhouyou.http.callback.DownloadProgressCallBack;
import com.zhouyou.http.exception.ApiException;

import java.io.File;

public class WebViewActivity extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initView();
        initData();
    }
    private void initData(){
        EasyHttp.downLoad("ecooperation/policydownload/downloadurl.do?platfromcodes=CPI000919&policyNo=D404C1A3694B3D890440599CE7D5EAC853B8F0C3E26BE8C2820B8F5CB6EF44EA&insuredID=74729A2CDB35C1F43BC747EDAE68AC54BEE907413258E208F5711A0B19B362F6&flag=Y")
                .baseUrl("http://partnertest.mypicc.com.cn/")
                .savePath("/sdcard/temp")
                .saveName("baoxian.pdf")
                .execute(new DownloadProgressCallBack<String>() {
                    @Override
                    public void onStart() {
                        Log.i("TAG","onStart下载开始了");
                    }

                    @Override
                    public void onError(ApiException e) {
                        Log.i("TAG","onError"+e.toString());
                    }

                    @Override
                    public void update(long bytesRead, long contentLength, boolean done) {
                        Log.i("TAG","总进度="+contentLength+"\n当前进度="+bytesRead+"\n下载完毕"+done);
                    }

                    @Override
                    public void onComplete(String path) {
                        Log.i("TAG","下载完毕"+path);
                        File file = new File(path);
//                        mWebView.loadUrl("http://mozilla.github.io/pdf.js/web/viewer.html?file="+file);
                        mWebView.loadUrl("file:///android_asset/index.html?" + file);
                    }
                });

    }
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    private void initView() {
        mWebView = (WebView) findViewById(R.id.mWebView);
        WebSettings settings = mWebView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setLoadWithOverviewMode(true); // 缩放至屏幕的大小
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true); //设置内置的缩放控件。
        settings.setDisplayZoomControls(false);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowUniversalAccessFromFileURLs(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.setWebViewClient(new WebViewClient());
    }
}
