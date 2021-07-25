package com.example.happyplace;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    CardView amazon;
    CardView myntra;
    CardView zomato;
    CardView swiggy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amazon=findViewById(R.id.Amazon);
        myntra=findViewById(R.id.Myntra);
        zomato=findViewById(R.id.Zomato);
        swiggy=findViewById(R.id.Swiggy);

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,AmazonActivity.class));


            }
        });
        myntra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,MyntraActivity.class));
            }
        });
       zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,ZomatoActivity.class));
            }
        });

       swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SwiggyActivity.class));
            }
        });



    }
}