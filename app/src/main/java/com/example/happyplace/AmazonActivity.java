package com.example.happyplace;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AmazonActivity extends AppCompatActivity {
    WebView web;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amazon);
        web=findViewById(R.id.web);
        WebSettings settings =web.getSettings();
        settings.setJavaScriptEnabled(true);


        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.amazon.in/");

    }
}