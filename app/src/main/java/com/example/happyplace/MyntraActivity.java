package com.example.happyplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyntraActivity extends AppCompatActivity {
    WebView webi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myntra);
        webi=findViewById(R.id.webi);
        WebSettings settings =webi.getSettings();
        settings.setJavaScriptEnabled(true);


        webi.setWebViewClient(new WebViewClient());
        webi.loadUrl("https://www.myntra.com/");

    }
}