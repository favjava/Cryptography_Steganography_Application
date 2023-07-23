package com.ridwan.steganography;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;


public class StringtoHexMainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_main);


        Button stringencode = findViewById(R.id.string_encode_button);
        Button stringdecode = findViewById(R.id.string_decode_button);

        stringencode.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), StringEncode.class)));

        stringdecode.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), StringDecode.class)));

    }
}
