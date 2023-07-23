package com.ridwan.steganography;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashActi extends AppCompatActivity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(() -> {

            Intent start = new Intent(SplashActi.this,InitialMainActivity.class);
            startActivity(start);
            finish();
        },2000);

    }
}
