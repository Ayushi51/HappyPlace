package com.example.happyplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ZomatoActivity extends AppCompatActivity {
    WebView webu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zomato);
        webu=findViewById(R.id.webu);
        WebSettings settings =webu.getSettings();
        settings.setJavaScriptEnabled(true);


        webu.setWebViewClient(new WebViewClient());
        webu.loadUrl("https://www.zomato.com/");
    }
}