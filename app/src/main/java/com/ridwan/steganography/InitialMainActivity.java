package com.ridwan.steganography;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.atomic.AtomicReference;


public class InitialMainActivity extends AppCompatActivity
    {
        Boolean isNightModeOn;
        @Override
        protected void onCreate(Bundle savedInstanceState) {


            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_initial_main);

            Button stringcryptography = findViewById(R.id.stringcryptography);
            Button steganography = findViewById(R.id.steganography);


            stringcryptography.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), StringtoHexMainActivity.class)));

            steganography.setOnClickListener(view -> startActivity(new Intent(getApplicationContext(), MainActivity.class)));



//            darkmodebtn.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view)
//                        {
//                            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//                        }




        }
    }

