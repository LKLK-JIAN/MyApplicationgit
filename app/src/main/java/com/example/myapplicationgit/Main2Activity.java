package com.example.myapplicationgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button bj=(Button)findViewById(R.id.bj);
        bj.setOnClickListener(this);
        Button sh=(Button)findViewById(R.id.sh);
        sh.setOnClickListener(this);
        Button nj=(Button)findViewById(R.id.nj);
        nj.setOnClickListener(this);
        webview=(WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setWebChromeClient(new WebChromeClient());
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.sina.com.cn/");
        webview.setInitialScale(57*3);
    }

    @Override
    public void onClick(View v) {
       switch (v.getId()){
           case R.id.bj:
               openUrl("beijing");
               break;
           case R.id.sh:
               openUrl("shanghai");
               break;
           case R.id.nj:
               openUrl("nanjing");
               break;
       }
    }
    public void openUrl(String id){
        webview.loadUrl("http://cache.xixik.com.cn/8/"+id+"/");
    }
}
