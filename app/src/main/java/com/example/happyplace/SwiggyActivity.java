package com.example.happyplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SwiggyActivity extends AppCompatActivity {
    WebView webo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);
        webo=findViewById(R.id.webo);
        WebSettings settings =webo.getSettings();
        settings.setJavaScriptEnabled(true);


        webo.setWebViewClient(new WebViewClient());
        webo.loadUrl("https://www.swiggy.com/");
    }
}